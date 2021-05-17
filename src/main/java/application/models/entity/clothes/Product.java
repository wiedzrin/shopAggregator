package application.models.entity.clothes;

import application.models.enums.Season;

import java.math.BigDecimal;
import java.util.List;

public abstract class Product {
    protected String name;
    protected String type;
    protected BigDecimal price;
    protected Season season;
    protected String color;
    protected String originCountry;
    protected List<String> img;

    public Product(String name, String type, BigDecimal price, Season season, String color, String originCountry, List<String> img) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.season = season;
        this.color = color;
        this.originCountry = originCountry;
        this.img = img;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public List<String> getImg() {
        return img;
    }

    public void setImg(List<String> img) {
        this.img = img;
    }
}
