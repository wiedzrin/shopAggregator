package application.models.dao.repo;

import application.models.entity.clothes.shoes.Sneakers;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SneakersRepo extends CrudRepository<Sneakers, Long> {
    List<Sneakers> findAll();
}