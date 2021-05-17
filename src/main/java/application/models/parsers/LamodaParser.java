package application.models.parsers;

import application.models.enums.Season;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public abstract class LamodaParser implements Parser {
    public static final String BASE_URL = "https://www.lamoda.ru/";
    public static final String BASE_IMG_URL = "http://a.lmcdn.ru/img600x866";
    public static final String PRODUCTS_LIST = "products-list-item__link link";
    public static final String PRODUCT_NAME = "product-title__brand-name";
    public static final String PRODUCT_TYPE = "product-title__model-name";
    public static final String PRODUCT_PRICE = "product-prices__price";
    public static final String PRODUCT_ATTRIBUTE = "ii-product__attribute";

    public static void main(String[] args) throws IOException {
        LamodaParser parser = new SneakersParser();
        System.out.println();
    }

    public Season parseSeason(String season) {
        season = season.toLowerCase();
        if (season.split(", ").length > 1 || season.equals("мульти") || season.equals("демисезон")) {
            return Season.DEMISEASON;
        } else if (season.equals("лето")) {
            return Season.SUMMER;
        } else if (season.equals("осень")) {
            return Season.AUTUMN;
        } else if (season.equals("зима")) {
            return Season.WINTER;
        } else if (season.equals("весна")) {
            return Season.SPRING;
        } else {
            return Season.DEMISEASON;
        }
    }

    public List<String> getImg(Document docItem) throws JsonProcessingException {
        JsonFactory factory = new JsonFactory();
        ObjectMapper mapper = new ObjectMapper(factory);
        JsonNode rootNode = mapper.readTree(docItem.select("d-gallery-widget").attr(":product-media"));

        Stream<JsonNode> targetStream = StreamSupport.stream(
                Spliterators.spliteratorUnknownSize(rootNode.get("images").elements(), Spliterator.ORDERED),
                false);
        return targetStream.map(e -> BASE_IMG_URL + e.get("src").asText()).collect(Collectors.toList());
    }
}
