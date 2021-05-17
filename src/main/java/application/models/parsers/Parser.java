package application.models.parsers;

import application.models.entity.clothes.Product;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface Parser {
    Product parse() throws JsonProcessingException;
}