package com.love.java21.services;

import com.love.java21.models.User;
import com.love.java21.models.UserDTO;

/**
 * The type User service.
 */
public class UserService {
    /**
     * Create user.
     *
     * @param userDTO the user dto
     * @return the user
     */
    public User createUser(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.name);
        user.setEmail(userDTO.email);
        return user;
    }
}
