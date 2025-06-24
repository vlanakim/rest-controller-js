package habsida.spring.boot_security.demo.service;

import habsida.spring.boot_security.demo.model.Role;
import habsida.spring.boot_security.demo.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> findAll();
    List<Role> getAllRoles();
    User findByEmail(String email);
    void saveUser(User user);
    User getUser(Long id);
    void deleteUser(Long id);
    void updateUser(User user);
}

