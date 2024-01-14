package com.example.demo;
import com.example.demo.login.LoginService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

//@SpringBootTest

public class LoginTests {
    @Test
    void testCase1(){

        LoginService loginService = new LoginService();

        assertTrue(loginService.authenticateUser("user1", "password1"));
    }
    @Test
    void testCase2(){

        LoginService loginService = new LoginService();

        assertTrue(loginService.authenticateUser("user2", "password2"));
    }
    @Test
    void testCase3(){

        LoginService loginService = new LoginService();

        assertTrue(loginService.authenticateUser("user3", "password3"));
    }
    @Test
    void testCase4(){

        LoginService loginService = new LoginService();

        assertTrue(loginService.authenticateUser("user4", "password4"));
    }

}
