package com.okta.developer.crud.services;

import com.okta.developer.crud.model.User;
import com.okta.developer.crud.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService  implements UserDetailsService {
    private final Logger log = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public List<User> findAll() {
        log.info("==findAll method START==== inside the userService");
        return userRepository.findAll();
    }

    public User findUserById(Integer userId) {
        log.info("==findUserById method START==== inside the userService");
        Optional<User> userOptional = userRepository.findById(userId);
        if (userOptional.isPresent()) {
            log.info("==userRepository.findById(userId)===" + userOptional.get());
            User user = userOptional.get();
            return user;
        } else {
            log.warn("User with id " + userId + " not found");
            return null;
        }
    }

    public User createUser(User user) {
        log.info("==createUser method START==== inside the userService");
        /*Optional<User> existingUser = userRepository.findByEmail(user.getEmail());
        if(existingUser.isPresent()){
            return null;
        }else {
            User savedUser = userRepository.save(user);
            log.info("User created: " + savedUser);
            return savedUser;
        }*/
       User isUserExist = userRepository.findByEmail(user.getEmail());
       if(isUserExist == null){
           user.setPassword(passwordEncoder.encode(user.getPassword()));
           User savedUser = userRepository.save(user);
           log.info("User created: " + savedUser);
           return savedUser;
       }
        return null;
    }

    public User updateUser(Integer userId ,User updateUser) {
        Optional<User> userExist = userRepository.findById(userId);
        if (userExist.isPresent()) {
            User existingUser = userExist.get();
            existingUser.setFirstName(updateUser.getFirstName());
            existingUser.setLastName(updateUser.getLastName());
            existingUser.setEmail(updateUser.getEmail());
            existingUser.setLocation(updateUser.getLocation());
            existingUser.setJoinDate(updateUser.getJoinDate());
            existingUser.setPassword(updateUser.getPassword());
            User updatedUser = userRepository.save(existingUser);
            log.info("User updated: " + updatedUser);
            return updatedUser;
        } else {
            return null;
        }
    }


    public String deleteUser(Integer userId) {
        Optional<User> userExist = userRepository.findById(userId);
        if (userExist.isPresent()) {
           userRepository.deleteById(userId);
            return "User with ID " + userId + " deleted successfully";
        } else {
            return "User with id " + userId + " not found";
        }
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), new ArrayList<>());
    }
}
