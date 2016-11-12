package io.sadique.spring.example.docker.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static java.util.Collections.singletonMap;

@RestController
public class HelloController {
  @RequestMapping("/hello")
  public Map hello() {
    return singletonMap("message", "hello");
  }
}
