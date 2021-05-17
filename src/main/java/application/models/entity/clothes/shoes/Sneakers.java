package application.models.entity.clothes.shoes;

import application.models.entity.clothes.Shoes;
import application.models.enums.Season;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "shoes")
public class Sneakers extends Shoes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Sneakers(String name, String type, BigDecimal price, Season season, String color, String originCountry, List<String> img, List<Double> size,
                    String upperMaterial, String internalMaterial, String soleMaterial, String insoleMaterial) {
        super(name, type, price, season, color, originCountry, img, size, upperMaterial, internalMaterial, soleMaterial, insoleMaterial);
    }

    public Sneakers() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}