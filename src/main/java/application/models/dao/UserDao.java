package application.models.dao;

import application.models.dao.repo.UserRepo;
import application.models.dto.UserDto;
import application.models.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDao {
    @Autowired
    private UserRepo userRepo;

    public User addUser(User user) {
        return userRepo.save(user);
    }

    public boolean checkUser(String username, String password) {
        return userRepo.findUserByUsernameAndPassword(username, password).isPresent();
    }
}
