package application.models.entity.clothes.shoes;

import application.models.entity.clothes.Product;
import application.models.entity.clothes.Shoes;
import application.models.enums.Season;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "sneakers")
public class Sneakers extends Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String type;
    private BigDecimal price;
    private Season season;
    private String color;
    private String originCountry;
    private String img;
    private String size;
    private String upperMaterial;
    private String internalMaterial;
    private String soleMaterial;
    private String insoleMaterial;

    public Sneakers(String name, String type, BigDecimal price, Season season, String color, String originCountry, String img, String size, String upperMaterial, String internalMaterial, String soleMaterial, String insoleMaterial) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.season = season;
        this.color = color;
        this.originCountry = originCountry;
        this.img = img;
        this.size = size;
        this.upperMaterial = upperMaterial;
        this.internalMaterial = internalMaterial;
        this.soleMaterial = soleMaterial;
        this.insoleMaterial = insoleMaterial;
    }

    public Sneakers() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Season getSeason() {
        return season;
    }

    public String getColor() {
        return color;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public String getImg() {
        return img;
    }

    public String getSize() {
        return size;
    }

    public String getUpperMaterial() {
        return upperMaterial;
    }

    public String getInternalMaterial() {
        return internalMaterial;
    }

    public String getSoleMaterial() {
        return soleMaterial;
    }

    public String getInsoleMaterial() {
        return insoleMaterial;
    }

    @Override
    public String toString() {
        return "Sneakers{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", season=" + season +
                ", color='" + color + '\'' +
                ", originCountry='" + originCountry + '\'' +
                ", img=" + img +
                ", id=" + id +
                '}';
    }
}