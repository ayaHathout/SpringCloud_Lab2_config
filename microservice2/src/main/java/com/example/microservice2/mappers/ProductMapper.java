package com.example.microservice2.mappers;

import com.example.microservice2.dtos.ProductDTO;
import com.example.microservice2.entities.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductDTO productToProductDTO(Product product);
}
