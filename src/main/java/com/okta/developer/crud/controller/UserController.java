package com.okta.developer.crud.controller;

import com.okta.developer.crud.model.User;
import com.okta.developer.crud.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/rest")
public class UserController {
    private final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;
    @GetMapping("/users")
    public List<User> getUserList(){
        return userService.findAll();
    }
    @GetMapping("/user/{userId}")
    public ResponseEntity<?>  getUserById(@PathVariable String userId){
        User isUserExist = userService.findUserById(Integer.parseInt(userId));
        if(isUserExist == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("User with id " + userId + " not found");
        }else {
            return  ResponseEntity.ok(isUserExist);
        }

    }

    @PostMapping("/create/user")
    public ResponseEntity<?> createUser(@RequestBody User user){
        User isUserExist = userService.createUser(user);
        if(isUserExist == null){
            return ResponseEntity.status(HttpStatus. ALREADY_REPORTED)
                    .body("User with email " + user.getEmail() + " already exists");
        }else {
            return  ResponseEntity.status(HttpStatus.CREATED).body(isUserExist) ;
        }
    }

    @PutMapping("/users/{userId}")
    public ResponseEntity<?> updateUser(@PathVariable Integer userId, @RequestBody User user){
        User isUserExist = userService.updateUser(userId, user);
        if(isUserExist == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("User with id " + userId + " not found");
        }else {
            return  ResponseEntity.ok(isUserExist);
        }
    }

    @DeleteMapping("/user/{userId}")
    public ResponseEntity<?> updateUser(@PathVariable Integer userId){
        String isUserExist = userService.deleteUser(userId);
        if(isUserExist.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("User with id " + userId + " not found");
        } else {
            return  ResponseEntity.ok(isUserExist);
        }
    }

}
