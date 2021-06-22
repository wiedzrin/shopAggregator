package application.models.parsers;

import application.models.dao.repo.SneakersRepo;
import application.models.entity.clothes.Product;
import application.models.entity.clothes.shoes.Sneakers;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

@Component
public class SneakersParser extends LamodaParser {
    public static final String SNEAKERS_URL = "https://www.lamoda.ru/c/5971/shoes-muzhkrossovki/?sitelink=topmenuM&l=7";
    private Document doc;
    private List<Element> productList;
    private SneakersRepo sneakersRepo;

    public SneakersParser() throws IOException {
        this.doc = Jsoup.connect(SNEAKERS_URL).get();
        this.productList = doc.getElementsByClass(PRODUCTS_LIST);
    }

    @Override
    public List<Product> parse() throws IOException {
        List<Product> sneakers = new ArrayList<>();
        for (Element elem : productList) {
            Document docItem = Jsoup.connect(BASE_URL + elem.attr("href")).get();
            Elements eAttributes = docItem.getElementsByClass(PRODUCT_ATTRIBUTE);

            Map<String, String> attributes = new HashMap<>();
            attributes.put("Материалверха:", null);
            attributes.put("Внутреннийматериал:", null);
            attributes.put("Материалподошвы:", null);
            attributes.put("Материалстельки:", null);
            attributes.put("Сезон:", null);
            attributes.put("Цвет:", null);
            attributes.put("Странапроизводства:", null);

            eAttributes.stream().forEach(e -> attributes.entrySet().stream().forEach(entry -> {
                String attrKey = e.select("span").get(0).text().replaceAll(" ", "");
                String attrValue = e.select("span").get(1).text();
                if (attrKey.equals(entry.getKey())) {
                    entry.setValue(attrValue);
                }
            }));
            Elements sizes = docItem.getElementsByClass("ii-select__column_native").get(1).getAllElements();
            sneakers.add(new Sneakers(docItem.getElementsByClass(PRODUCT_NAME).attr("title"),
                    docItem.getElementsByClass(PRODUCT_TYPE).html(),
                    new BigDecimal(docItem.getElementsByClass(PRODUCT_PRICE).first().text().replaceAll("([ ₽])", "")),
                    super.parseSeason(attributes.get("Сезон:")),
                    attributes.get("Цвет:"),
                    attributes.get("Странапроизводства:"),
                    getImg(docItem),
                    getSize(sizes),
                    attributes.get("Материалверха:"),
                    attributes.get("Внутреннийматериал:"),
                    attributes.get("Материалподошвы:"),
                    attributes.get("Материалстельки:")));
        }
        return sneakers;
    }

    private String getSize(Elements e) {
        StringBuilder sizes = new StringBuilder();
        e.remove(0);

        for (Element element : e) {
            sizes.append(element.text().replaceAll("([ RUS])", "").replaceAll(",", ".") + ", ");
        }
        return sizes.toString();
    }
}
