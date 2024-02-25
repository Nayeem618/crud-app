package com.okta.developer.crud.controller;

import com.okta.developer.crud.model.Users;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/rest/user")
public class UserController {
    private final Logger log = LoggerFactory.getLogger(UserController.class);

    public List<Users> getUserList(){
        log.info("==getUserList method START====");
        return null;
    }



}
