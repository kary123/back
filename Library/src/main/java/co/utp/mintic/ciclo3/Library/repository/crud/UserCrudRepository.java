package co.utp.mintic.ciclo3.Library.repository.crud;

import co.utp.mintic.ciclo3.Library.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCrudRepository extends JpaRepository<User, Integer> {
}
