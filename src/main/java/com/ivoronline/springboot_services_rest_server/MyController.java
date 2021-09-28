package com.ivoronline.springboot_services_rest_server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @RequestMapping("Hello")
  String hello() {
    return "Hello from Server";
  }

}
