package application.models.dao.repo;

import application.models.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepo extends CrudRepository<User, Long> {
    Optional<User> findUserByUsernameAndPassword(String username, String password);
}
