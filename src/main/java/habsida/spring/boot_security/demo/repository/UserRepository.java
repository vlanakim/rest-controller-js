package habsida.spring.boot_security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import habsida.spring.boot_security.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
