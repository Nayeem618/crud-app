package com.okta.developer.crud.controller.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class adminController {
    private final Logger log = LoggerFactory.getLogger(adminController.class);
    @GetMapping("/demo")
  public String demo(){
      log.info("inside the admin controller");
      return "inside the demo method ====adminController";
  }

}