package tech.dimitar.hexagonal.example.service.core.ports.spi;

import tech.dimitar.hexagonal.example.service.core.data.UserDTO;

public interface UserPersistencePort {
    UserDTO createUser(UserDTO userDTO) throws Exception;
}
