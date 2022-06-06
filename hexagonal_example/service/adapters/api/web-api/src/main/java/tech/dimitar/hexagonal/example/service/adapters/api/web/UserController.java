package tech.dimitar.hexagonal.example.service.adapters.api.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.dimitar.hexagonal.example.service.core.ports.api.UserServicePort;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/service/users")
public class UserController {
    private final UserServicePort userServicePort;


    @GetMapping
    public ResponseEntity<?> testGet() {
        return new ResponseEntity<Object>("Success!", HttpStatus.OK);
    }

}
