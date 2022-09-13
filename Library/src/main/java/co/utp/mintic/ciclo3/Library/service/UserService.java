package co.utp.mintic.ciclo3.Library.service;

import co.utp.mintic.ciclo3.Library.model.User;
import co.utp.mintic.ciclo3.Library.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.getAll();
    }

    public Optional<User> getCabin(int id) {
        return userRepository.getCabin(id);
    }


    public void delete(int id){
        userRepository.delete(id);
    }

    public User save(User user) {
        if (user.getId() == null) {
            return userRepository.save(user);
        } else {
            Optional<User> evt = userRepository.getCabin(user.getId());
            if (!evt.isPresent()) {
                return userRepository.save(user);
            }
            return user;
        }
    }

    public User update(User user) {
        if (user.getId() != null) {
            Optional<User> g = userRepository.getCabin(user.getId());
            if (g.isPresent()) {
                if (user.getName() != null) {
                    g.get().setName(user.getName());
                }
                return userRepository.save(g.get());
            }
        }
        return user;
    }


}
