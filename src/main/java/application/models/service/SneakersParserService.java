package application.models.service;

import application.models.dao.repo.SneakersRepo;
import application.models.entity.clothes.shoes.Sneakers;
import application.models.parsers.SneakersParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SneakersParserService {
    @Autowired
    private SneakersRepo sneakersRepo;
    @Autowired
    private SneakersParser sneakersParser;

    public void parseAndSave() throws IOException {
        List<Sneakers> sneakers = sneakersParser.parse().stream().map(e -> (Sneakers) e).collect(Collectors.toList());
        sneakersRepo.saveAll(sneakers);
    }
}
