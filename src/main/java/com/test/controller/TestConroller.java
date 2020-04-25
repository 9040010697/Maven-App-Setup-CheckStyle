package com.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class TestConroller {
  private String name;
  
  
  public TestConroller() {
    super();
    this.name = "DJ";
  }


  @GetMapping("/test")
  public ResponseEntity<String> insertData() {
    return ResponseEntity.ok("Hello " + name);
  }

}
