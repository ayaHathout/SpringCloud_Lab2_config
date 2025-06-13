package com.example.microservice1.feignClients;

import com.example.microservice1.entities.Product;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

@FeignClient(name = "microservice2")
public interface FeignClientInterface {
    public List<Product> getUsers();
}
