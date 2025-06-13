package com.example.microservice1.controllers.users;

import com.example.microservice1.dtos.UserDTO;
import com.example.microservice1.entities.Product;
import com.example.microservice1.entities.User;
import com.example.microservice1.feignClients.FeignClientInterface;
import com.example.microservice1.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private FeignClientInterface feignClientInterface;

    @GetMapping
    public List<UserDTO> getUsers() {
        return userService.findAll();
    }

    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userService.save(user);
    }

    /*
    @GetMapping("products")
    public List<Product> getAllProductsFromProductService() {
        return userService.getAllProductsFromProductService();
    }
     */

    @GetMapping("products")
    public List<Product> getAllProductsFromProductService() {
        return feignClientInterface.getUsers();
    }

    @GetMapping("/hello")
    public String sayHello() {
        return userService.printHello();
    }
}
