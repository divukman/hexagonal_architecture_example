package tech.dimitar.hexagonal.example.service.adapters.spi.firebase;

import tech.dimitar.hexagonal.example.service.core.data.UserDTO;
import tech.dimitar.hexagonal.example.service.core.ports.spi.UserPersistencePort;

public class FirebaseUserService implements UserPersistencePort {
    @Override
    public UserDTO createUser(UserDTO userDTO) {
        System.out.println("FIREBASE SERVICE CALLED WITH " + userDTO.toString());
        return userDTO;
    }
}
