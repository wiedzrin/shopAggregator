package application.models.parsers;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class LamodaParser {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://www.lamoda.ru/c/5971/shoes-muzhkrossovki/?sitelink=topmenuM&l=7").get();



        String data = doc.getElementsByClass("products-list-item__link link").attr("href");

        Document docItem = Jsoup.connect("https://www.lamoda.ru/" + data).get();

        String brandName = docItem.getElementsByClass("product-title__brand-name").attr("title");
        String shoeType = docItem.getElementsByClass("product-title__model-name").text();
        String price = docItem.getElementsByClass("product-prices__price").first().text().replaceAll("([ ₽])", "");

        String materials = docItem.getElementsByClass("ii-product__attribute").get(0).select("span").get(0).text() +
                            docItem.getElementsByClass("ii-product__attribute").get(0).select("span").get(1).text() +
                            ", " + docItem.getElementsByClass("ii-product__attribute").get(1).select("span").get(0).text() +
                            docItem.getElementsByClass("ii-product__attribute").get(1).select("span").get(1).text() +
                            ", " + docItem.getElementsByClass("ii-product__attribute").get(2).select("span").get(0).text() +
                            docItem.getElementsByClass("ii-product__attribute").get(2).select("span").get(1).text() +
                            ", " + docItem.getElementsByClass("ii-product__attribute").get(3).select("span").get(0).text() +
                            docItem.getElementsByClass("ii-product__attribute").get(3).select("span").get(1).text();

        String season = docItem.getElementsByClass("ii-product__attribute").get(4).select("span").get(1).text();
        String color = docItem.getElementsByClass("ii-product__attribute").get(5).select("span").get(1).text();
        String originCountry = docItem.getElementsByClass("ii-product__attribute").get(7).select("span").get(1).text();

        System.out.println("Brand: " + brandName +
                            "\nType: " + shoeType +
                            "\nPrice: " + price +
                            "\nMaterials: " + materials +
                            "\nSeason: " + season +
                            "\nColor: " + color +
                            "\nOriginCountry: " + originCountry);
    }
}
