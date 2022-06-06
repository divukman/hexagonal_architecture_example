package tech.dimitar.hexagonal.example.service.adapters.api.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tech.dimitar.hexagonal.example.service.core.data.UserDTO;
import tech.dimitar.hexagonal.example.service.core.ports.api.UserServicePort;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/service/users")
public class UserController {
    private final UserServicePort userServicePort;


    @GetMapping
    public ResponseEntity<String> testGet() {
        return new ResponseEntity<String>("Success!", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UserDTO> createUser (@RequestBody @Validated final UserDTO userDTO) throws Exception {
        return new ResponseEntity<UserDTO>(userServicePort.createUser(userDTO), HttpStatus.CREATED);
    }

}
