package com.example.demo.login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import  com.example.demo.login.LoginService;
@RestController
@RequestMapping("/api/login")
public class LoginController {
    @PostMapping("/")
    public ResponseEntity<String> login(@RequestBody User user) {
        String token = userService.loginUser(user);
        return ResponseEntity.ok(token);
    }
}
