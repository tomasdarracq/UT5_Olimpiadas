package com.ucu.olimpiadas.Controller;

import com.ucu.olimpiadas.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/user")
public class UserController {
    @GetMapping(path = "/getAllUsers")
    public List<User> getAllUsers() {
        return null;
    }
    @GetMapping(path = "/getUser")
    public User getUser(@RequestBody int id) {
        return null;
    }
    @PostMapping(path = "/addUser")
    public User addUser(User user) {
        return user;
    }
}
