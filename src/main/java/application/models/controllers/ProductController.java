package application.models.controllers;

import application.models.dao.repo.SneakersRepo;
import application.models.entity.clothes.shoes.Sneakers;
import application.models.service.SneakersParserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@CrossOrigin
@RestController
public class ProductController {
    @Autowired
    SneakersRepo sneakersRepo;
    @Autowired
    private SneakersParserService sneakersParserService;

    @PostMapping("parseAndSaveSneakers")
    public void parseAndSaveSneakers() throws IOException {
        sneakersParserService.parseAndSave();
    }

    @GetMapping("getSneakers")
    public List<Sneakers> getSneakers() {
        return sneakersRepo.findAll();
    }
}
