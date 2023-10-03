package com.love.java21.models;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public interface UserDTO {
    @NotBlank String name = null;
    @Email String email = null;

}
