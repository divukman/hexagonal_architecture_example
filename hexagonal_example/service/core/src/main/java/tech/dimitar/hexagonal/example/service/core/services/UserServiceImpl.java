package tech.dimitar.hexagonal.example.service.core.services;

import lombok.RequiredArgsConstructor;
import tech.dimitar.hexagonal.example.service.core.data.UserDTO;
import tech.dimitar.hexagonal.example.service.core.ports.api.UserServicePort;
import tech.dimitar.hexagonal.example.service.core.ports.spi.UserPersistencePort;

@RequiredArgsConstructor
public class UserServiceImpl implements UserServicePort {
    private final UserPersistencePort userPersistencePort;

    @Override
    public UserDTO createUser(UserDTO userDTO) throws Exception {
        return userPersistencePort.createUser(userDTO);
    }
}
