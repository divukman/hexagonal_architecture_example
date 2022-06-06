package tech.dimitar.hexagonal.example.service.core.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    private String email;
    private boolean emailVerified;
    private String phoneNumber;
    private String password;
    private String displayName;
    private String photoURL;
    private boolean disabled;
    private HashMap<String, String> customClaims;
}

