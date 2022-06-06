package tech.dimitar.hexagonal.example.service.core.ports.api;

import tech.dimitar.hexagonal.example.service.core.data.UserDTO;

public interface UserServicePort {
    UserDTO createUser(UserDTO userDTO) throws Exception;
}
