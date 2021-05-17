package application.models.entity.clothes;

import application.models.enums.Season;

import java.math.BigDecimal;
import java.util.List;

public class Outwear extends Product {
    private List<String> size;
    private String material;
    private String liningMaterial;
    private String insulationMaterial;
    private String length;
    private String sleeveLength;
    private String design;

    public Outwear(String name, String type, BigDecimal price, Season season, String color, String originCountry, List<String> img, List<String> size,
                   String material, String liningMaterial, String insulationMaterial, String length, String sleeveLength, String design) {
        super(name, type, price, season, color, originCountry, img);
        this.size = size;
        this.material = material;
        this.liningMaterial = liningMaterial;
        this.insulationMaterial = insulationMaterial;
        this.length = length;
        this.sleeveLength = sleeveLength;
        this.design = design;
    }

    public Outwear() {
    }

    public List<String> getSize() {
        return size;
    }

    public void setSize(List<String> size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getLiningMaterial() {
        return liningMaterial;
    }

    public void setLiningMaterial(String liningMaterial) {
        this.liningMaterial = liningMaterial;
    }

    public String getInsulationMaterial() {
        return insulationMaterial;
    }

    public void setInsulationMaterial(String insulationMaterial) {
        this.insulationMaterial = insulationMaterial;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getSleeveLength() {
        return sleeveLength;
    }

    public void setSleeveLength(String sleeveLength) {
        this.sleeveLength = sleeveLength;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }
}
