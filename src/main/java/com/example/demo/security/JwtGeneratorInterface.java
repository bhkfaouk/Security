package com.example.demo.security;

import com.example.demo.user.User;



import java.util.Map;

public interface JwtGeneratorInterface {
    Map<String , String> generateToken(User user);

}
