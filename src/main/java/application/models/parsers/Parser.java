package application.models.parsers;

import application.models.entity.clothes.Product;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;
import java.util.List;

public interface Parser {
    List<Product> parse() throws IOException;
}