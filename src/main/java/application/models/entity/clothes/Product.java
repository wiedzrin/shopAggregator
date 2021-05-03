package application.models.entity.clothes;

import application.models.enums.Season;

import java.math.BigDecimal;

public abstract class Product {
    protected String name;
    protected String type;
    protected BigDecimal price;
    protected String materials;
    protected Season season;
    protected String color;
    protected String originCountry;

    public Product(String name, String type, BigDecimal price, String materials, Season season, String color, String originCountry) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.materials = materials;
        this.season = season;
        this.color = color;
        this.originCountry = originCountry;
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

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
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
}
