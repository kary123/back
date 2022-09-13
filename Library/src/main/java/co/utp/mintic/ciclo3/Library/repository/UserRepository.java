package co.utp.mintic.ciclo3.Library.repository;

import co.utp.mintic.ciclo3.Library.model.User;
import co.utp.mintic.ciclo3.Library.repository.crud.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

    @Autowired
    private UserCrudRepository userCrudRepository;

    public List<User> getAll() {
        return (List<User>) userCrudRepository.findAll();
    }

    public Optional<User> getCabin(int id) {
        return userCrudRepository.findById(id);
    }

    public User save(User user) {
        return userCrudRepository.save(user);
    }

    public void delete(int id) {
        userCrudRepository.deleteById(id);
    }
}


