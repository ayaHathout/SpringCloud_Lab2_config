package com.example.microservice1.services;

import com.example.microservice1.dtos.UserDTO;
import com.example.microservice1.entities.Product;
import com.example.microservice1.entities.User;
import com.example.microservice1.mappers.UserMapper;
import com.example.microservice1.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RestTemplate restTemplate;

    public List<UserDTO> findAll() {
        return userRepository.findAll()
                .stream()
                .map(userMapper::userToUserDTO)
                .collect(Collectors.toList());
    }

   public User save(User user) {
       return userRepository.save(user);
   }

   /*
   public List<Product> getAllProductsFromProductService() {
       String url = "http://localhost:8086/products";
       Product[] products = restTemplate.getForObject(url, Product[].class);
       return Arrays.asList(products);
   }
    */

   public String printHello() {
        return "Hello World from microservice1";
   }
}
