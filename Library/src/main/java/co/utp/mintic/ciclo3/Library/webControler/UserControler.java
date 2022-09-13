package co.utp.mintic.ciclo3.Library.webControler;


import co.utp.mintic.ciclo3.Library.model.User;
import co.utp.mintic.ciclo3.Library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/User")
public class UserControler {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> getCabins(){
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getCabin(@PathVariable("id") int id){
        return userService.getCabin(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public User save(@RequestBody User user){
        return userService.save(user);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public User update(@RequestBody User user) {
        return userService.update(user);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") int id) {
         userService.delete(id);
    }
}