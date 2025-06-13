package com.example.microservice1.dtos;

import java.io.Serializable;

public record UserDTO(String fullName, String email) implements Serializable {
    // The canonical constructor is created by default
}
