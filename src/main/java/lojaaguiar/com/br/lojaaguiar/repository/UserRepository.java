package lojaaguiar.com.br.lojaaguiar.repository;

import lojaaguiar.com.br.lojaaguiar.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, String> {
    Optional<User> findByUsername(String username);
}
