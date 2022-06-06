package tech.dimitar.hexagonal.example.delivery.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.dimitar.hexagonal.example.service.core.data.UserDTO;
import tech.dimitar.hexagonal.example.service.core.ports.api.UserServicePort;
import tech.dimitar.hexagonal.example.service.core.ports.spi.UserPersistencePort;
import tech.dimitar.hexagonal.example.service.core.services.UserServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    public UserPersistencePort userPersistencePort() {
        return new UserPersistencePort() {
            @Override
            public UserDTO createUser(UserDTO userDTO) {
                return UserDTO.builder().email("test@test.com").build();
            }
        };
    }

    @Bean
    public UserServicePort userServicePort() {
        return new UserServiceImpl(userPersistencePort());
    }
}
