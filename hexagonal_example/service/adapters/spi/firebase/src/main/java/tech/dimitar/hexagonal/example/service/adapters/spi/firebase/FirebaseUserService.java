package tech.dimitar.hexagonal.example.service.adapters.spi.firebase;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.UserRecord;
import tech.dimitar.hexagonal.example.service.core.data.UserDTO;
import tech.dimitar.hexagonal.example.service.core.ports.spi.UserPersistencePort;

public class FirebaseUserService implements UserPersistencePort {
    @Override
    public UserDTO createUser(UserDTO userDTO) throws FirebaseAuthException {
        System.out.println("FIREBASE SERVICE CALLED WITH " + userDTO.toString());


        UserRecord.CreateRequest request = new UserRecord.CreateRequest()
                .setEmail(userDTO.getEmail())
                .setEmailVerified(false)
                .setPassword(userDTO.getPassword())
                .setPhoneNumber(userDTO.getPhoneNumber())
                .setDisplayName(userDTO.getDisplayName())
                .setPhotoUrl(userDTO.getPhotoURL())
                .setDisabled(false);

        UserRecord userRecord = FirebaseAuth.getInstance().createUser(request);
        System.out.println("Successfully created new user: " + userRecord.getUid());

        return userDTO;
    }
}
