package application.models.parsers;

import application.models.entity.clothes.Product;
import application.models.entity.clothes.outerwear.Coat;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoatParser {
//    public static final String COAT_URL = "https://www.lamoda.ru/c/487/clothes-muzhskie-palto/";
//    private Document doc;
//    private Document docItem;
//
//    public CoatParser(Document doc, Document docItem) throws IOException {
//        this.doc = Jsoup.connect(COAT_URL).get();
//        this.docItem = Jsoup.connect(BASE_URL + doc.getElementsByClass(PRODUCTS_LIST).attr("href")).get();;
//    }
//
//    @Override
//    public Product parse() throws JsonProcessingException {
//        Elements eAttributes = docItem.getElementsByClass(PRODUCT_ATTRIBUTE);
//        Map<String, String> attributes = new HashMap<>();
//        attributes.put("Состав:", null);
//        attributes.put("Материалподкладки:", null);
//        attributes.put("Утеплитель:", null);
//        attributes.put("Длина:", null);
//        attributes.put("Длина рукава:", null);
//        attributes.put("Узор:", null);
//        attributes.put("Сезон:", null);
//        attributes.put("Цвет:", null);
//        attributes.put("Странапроизводства:", null);
//
//        eAttributes.stream().forEach(e -> attributes.entrySet().stream().forEach(entry -> {
//            String attrKey = e.select("span").get(0).text().replaceAll(" ", "");
//            String attrValue = e.select("span").get(1).text();
//            if (attrKey.equals(entry.getKey())) {
//                entry.setValue(attrValue);
//            }
//        }));
//
//        return new Coat(docItem.getElementsByClass(PRODUCT_NAME).attr("title"),
//                docItem.getElementsByClass(PRODUCT_TYPE).attr("title"),
//                new BigDecimal(docItem.getElementsByClass(PRODUCT_PRICE).first().text().replaceAll("([ ₽])", "")),
//                super.parseSeason(attributes.get("Сезон:")),
//                attributes.get("Цвет:"),
//                attributes.get("Странапроизводства:"),
//                super.getImg(docItem),
//                getSize(),
//                attributes.get("Состав:"),
//                attributes.get("Материалподкладки:"),
//                attributes.get("Утеплитель:"),
//                attributes.get("Длина:"),
//                attributes.get("Длина рукава:"),
//                attributes.get("Узор:"));
//    }
//
//    private List<String> getSize() {
//        Elements e = docItem.getElementsByClass("ii-select__column_native").get(1).getAllElements();
//        e.remove(0);
//        List<String> sizes = new ArrayList<>();
//
//        for (Element element : e) {
//            sizes.add(element.text().replaceAll("([ RUS])", "").replaceAll(",", "."));
//        }
//        return sizes;
//    }
}
