package application.models.parsers;

import application.models.entity.clothes.Product;
import application.models.entity.clothes.shoes.Sneakers;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

public class SneakersParser extends LamodaParser {
    public static final String SNEAKERS_URL = "https://www.lamoda.ru/c/5971/shoes-muzhkrossovki/?sitelink=topmenuM&l=7";
    private Document doc;
    private Document docItem;

    public SneakersParser() throws IOException {
        this.doc = Jsoup.connect(SNEAKERS_URL).get();
        this.docItem = Jsoup.connect(BASE_URL + doc.getElementsByClass(PRODUCTS_LIST).attr("href")).get();
    }

    @Override
    public Product parse() throws JsonProcessingException {
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

        return new Sneakers(docItem.getElementsByClass(PRODUCT_NAME).attr("title"),
                docItem.getElementsByClass(PRODUCT_TYPE).attr("title"),
                new BigDecimal(docItem.getElementsByClass(PRODUCT_PRICE).first().text().replaceAll("([ ₽])", "")),
                super.parseSeason(attributes.get("Сезон:")),
                attributes.get("Цвет:"),
                attributes.get("Странапроизводства:"),
                super.getImg(docItem),
                getSize(),
                attributes.get("Материалверха:"),
                attributes.get("Внутреннийматериал:"),
                attributes.get("Материалподошвы:"),
                attributes.get("Материалстельки:"));
    }

    private List<Double> getSize() {
        Elements e = docItem.getElementsByClass("ii-select__column_native").get(1).getAllElements();
        e.remove(0);
        List<Double> sizes = new ArrayList<>();

        for (Element element : e) {
            sizes.add(Double.valueOf(element.text().replaceAll("([ RUS])", "").replaceAll(",", ".")));
        }
        return sizes;
    }
}
