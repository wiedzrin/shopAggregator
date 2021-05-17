package application.models.entity.clothes.outerwear;

import application.models.entity.clothes.Outwear;
import application.models.enums.Season;

import java.math.BigDecimal;
import java.util.List;

public class Coat extends Outwear {
    public Coat(String name, String type, BigDecimal price, Season season, String color, String originCountry, List<String> img, List<String> size,
                String material, String liningMaterial, String insulationMaterial, String length, String sleeveLength, String design) {
        super(name, type, price, season, color, originCountry, img, size, material, liningMaterial, insulationMaterial, length, sleeveLength, design);
    }

    public Coat() {
    }
}
