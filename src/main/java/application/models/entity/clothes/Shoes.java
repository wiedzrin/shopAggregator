package application.models.entity.clothes;

import application.models.enums.Season;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Shoes")
public class Shoes extends Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int size;

    public Shoes(String name, String type, BigDecimal price, String materials, Season season, String color, String originCountry, int size) {
        super(name, type, price, materials, season, color, originCountry);
        this.size = size;
    }

    public Shoes() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}