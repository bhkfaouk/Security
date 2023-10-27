package com.example.demo.servicesImpl;

import com.example.demo.services.UserService;
import com.example.demo.user.User;
import com.example.demo.user.UserRepository;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl( UserRepository userRepository ){
        this.userRepository=userRepository;

    }

    @Override
    public void saveUser(User user) {
    userRepository.save(user);
    }

    @Override
    public User getUserByNameAndPassword(String name, String password) throws UsernameNotFoundException {
        User user = userRepository.findByUserNameAndPassword(name,password);
        if(user==null){
            throw new UsernameNotFoundException("Invalid id and password");
        }
                return user;
    }
}
