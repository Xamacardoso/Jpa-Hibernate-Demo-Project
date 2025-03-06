package dev.xamacardoso.course_jpa_hibernate.resources;

import dev.xamacardoso.course_jpa_hibernate.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    // ResponseEntity defines which entity will be retrieved from entities
    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L, "Jonas", "jonas@gmail", "+559684475525", "kleinianrs");

        // Returns a entity with status code OK
        return ResponseEntity.ok().body(user);
    }
}
