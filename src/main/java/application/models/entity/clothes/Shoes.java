package application.models.entity.clothes;

import application.models.enums.Season;

import java.math.BigDecimal;
import java.util.List;

public class Shoes extends Product {
    private List<Double> size;
    private String upperMaterial;
    private String internalMaterial;
    private String soleMaterial;
    private String insoleMaterial;

    public Shoes(String name, String type, BigDecimal price, Season season, String color, String originCountry, List<String> img, List<Double> size,
                 String upperMaterial, String internalMaterial, String soleMaterial, String insoleMaterial) {
        super(name, type, price, season, color, originCountry, img);
        this.size = size;
        this.upperMaterial = upperMaterial;
        this.internalMaterial = internalMaterial;
        this.soleMaterial = soleMaterial;
        this.insoleMaterial = insoleMaterial;
    }

    public Shoes() {
    }

    public List<Double> getSize() {
        return size;
    }

    public void setSize(List<Double> size) {
        this.size = size;
    }

    public String getUpperMaterial() {
        return upperMaterial;
    }

    public void setUpperMaterial(String upperMaterial) {
        this.upperMaterial = upperMaterial;
    }

    public String getInternalMaterial() {
        return internalMaterial;
    }

    public void setInternalMaterial(String internalMaterial) {
        this.internalMaterial = internalMaterial;
    }

    public String getSoleMaterial() {
        return soleMaterial;
    }

    public void setSoleMaterial(String soleMaterial) {
        this.soleMaterial = soleMaterial;
    }

    public String getInsoleMaterial() {
        return insoleMaterial;
    }

    public void setInsoleMaterial(String insoleMaterial) {
        this.insoleMaterial = insoleMaterial;
    }
}
