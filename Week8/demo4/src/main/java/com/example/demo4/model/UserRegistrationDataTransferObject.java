package com.example.demo4.model;

import java.util.PrimitiveIterator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegistrationDataTransferObject {
    private String name;
    private String lastName;
    private String password;
    private String email;
}
