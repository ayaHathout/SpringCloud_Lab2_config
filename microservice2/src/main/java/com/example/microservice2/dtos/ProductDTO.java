package com.example.microservice2.dtos;

import java.io.Serializable;
import java.math.BigDecimal;

public record ProductDTO(String name, String description, BigDecimal price) implements Serializable {}
