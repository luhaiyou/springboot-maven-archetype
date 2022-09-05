package com.demo.controller;

import com.demo.entity.DemoUser;
import com.demo.service.DemoUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoUserService demoUserService;

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @PostMapping("/users")
    public Object addUser(@RequestBody DemoUser user){
        demoUserService.saveUser(user);
        return user;
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Long id){
        demoUserService.deleteUser(id);
    }

}
