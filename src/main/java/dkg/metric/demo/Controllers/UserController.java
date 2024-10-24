package dkg.metric.demo.Controllers;


import dkg.metric.demo.DTOs.User.UserDTO;
import dkg.metric.demo.Entities.Users;
import dkg.metric.demo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private final UserService SERVICE;


    public UserController(UserService service) {
        SERVICE = service;
    }

    public ResponseEntity<Users> create(@RequestBody UserDTO userData){
         Users newuser = SERVICE.create(userData);
         return new ResponseEntity<>(newuser, HttpStatus.CREATED);
    }


}
