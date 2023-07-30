package org.openapitools.api;

import org.openapitools.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import com.example.demo.services.UserService;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-07-29T17:11:58.624538800+02:00[Europe/Berlin]")

@Controller
@RequestMapping("${openapi.swaggerPetstoreOpenAPI30.base-path:/api/v3}")
public class UserApiController implements UserApi {

    private final NativeWebRequest request;

    @Autowired
    private UserService userService;

    @Override
    public ResponseEntity<User> createUsersWithListInput(@Valid List<User> user) {
        // TODO Auto-generated method stub
        return UserApi.super.createUsersWithListInput(user);
    }

    @Override
    public ResponseEntity<Void> deleteUser(String username) {
        // TODO Auto-generated method stub
        return UserApi.super.deleteUser(username);
    }

    @Override
    public ResponseEntity<User> getUserByName(String username) {
        // TODO Auto-generated method stub
        return UserApi.super.getUserByName(username);
    }

    @Override
    public ResponseEntity<String> loginUser(@Valid String username, @Valid String password) {
        // TODO Auto-generated method stub
        return UserApi.super.loginUser(username, password);
    }

    @Override
    public ResponseEntity<Void> logoutUser() {
        // TODO Auto-generated method stub
        return UserApi.super.logoutUser();
    }

    @Override
    public ResponseEntity<Void> updateUser(String username, @Valid User user) {
        // TODO Auto-generated method stub
        return UserApi.super.updateUser(username, user);
    }

    public UserApiController(NativeWebRequest request) {
        this.request = request;
    }

    /*
    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }
    */

    public ResponseEntity<User> createUser(User user) {
        System.out.println("User:"+user.getLastName());
        com.example.demo.services.User aUser = new com.example.demo.services.User();
        aUser.setName(user.getLastName());
        aUser.setEmail(user.getEmail());

        userService.saveUser(aUser);

        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

}
