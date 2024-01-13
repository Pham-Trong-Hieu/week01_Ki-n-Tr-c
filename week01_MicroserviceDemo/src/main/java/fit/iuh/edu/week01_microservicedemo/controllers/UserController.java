package fit.iuh.edu.week01_microservicedemo.controllers;


import fit.iuh.edu.week01_microservicedemo.entites.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @GetMapping("/user/{id}")

    public ResponseEntity<User> getTutorialById(@PathVariable("id") long id) {
        User user = new User("1","nguyen van A");

            return new ResponseEntity<>(user, HttpStatus.
                    OK);

    }


}
