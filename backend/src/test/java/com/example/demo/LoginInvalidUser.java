package com.example.demo;
import com.example.demo.login.LoginService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

//@SpringBootTest

public class LoginInvalidUser {
    @Test
    void testCase1(){

        LoginService loginService = new LoginService();

        assertFalse(loginService.authenticateUser("user1", "password2"));
    }
    @Test
    void testCase2(){

        LoginService loginService = new LoginService();

        assertFalse(loginService.authenticateUser("user5", "password5"));
    }
    @Test
    void testCase3(){

        LoginService loginService = new LoginService();

        assertFalse(loginService.authenticateUser("user6", "password3"));
    }
    @Test
    void testCase4(){

        LoginService loginService = new LoginService();

        assertFalse(loginService.authenticateUser("user7", "password4"));
    }
    @Test
    void testCase5(){

        LoginService loginService = new LoginService();

        assertFalse(loginService.authenticateUser("user7", "password4"));
    }
    @Test
    void testCase6(){

        LoginService loginService = new LoginService();

        assertFalse(loginService.authenticateUser("user7", "password4"));
    }

}
