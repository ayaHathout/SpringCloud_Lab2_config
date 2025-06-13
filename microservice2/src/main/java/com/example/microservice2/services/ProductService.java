package com.example.microservice2.services;

import com.example.microservice2.dtos.ProductDTO;
import com.example.microservice2.entities.Product;
import com.example.microservice2.mappers.ProductMapper;
import com.example.microservice2.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

    public List<ProductDTO> findAll() {
        return productRepository.findAll()
                .stream()
                .map(productMapper::productToProductDTO)
                .collect(Collectors.toList());
    }

   public Product save(Product product) {
        return productRepository.save(product);
   }
}
