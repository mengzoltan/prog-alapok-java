package com.training360.regexp;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.util.Set;


public class User {

    @NotNull
    @Pattern(regexp = ".+@.+\\.[a-z]+", message = "Invalid email address!")
    @Size(min = 3, max = 11)
    private String email;

    public static void main(String[] args) {

        User user = new User();
        user.setEmail("sdf@admin.com1");

        try (ValidatorFactory factory = Validation.buildDefaultValidatorFactory()){
            Validator validator = factory.getValidator();
            Set<ConstraintViolation<User>> constraintViolations = validator.validate(user);

            for (ConstraintViolation<User> constraintViolation : constraintViolations) {
                System.out.println(constraintViolation.getMessage());
            }
        }
        System.out.println(user.email);
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
