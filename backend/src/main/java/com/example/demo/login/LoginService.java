package com.example.demo.login;
import java.util.HashMap;
import java.util.Map;

public class LoginService {
    private static final Map<String, String> validCredentials;

    static {
        validCredentials = new HashMap<>();
        validCredentials.put("user1", "password1");
        validCredentials.put("user2", "password2");
        validCredentials.put("user3", "password3");
        validCredentials.put("user4", "password4");
    }
    public boolean authenticateUser(String userName, String password){
        return validCredentials.containsKey(userName) && validCredentials.get(userName).equals(password);

    }
}
