package habsida.spring.boot_security.demo.service;

import habsida.spring.boot_security.demo.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> getAllUsers();
    void saveUser(User user);
    User getUser(Long id);
    void deleteUser(Long id);
}
