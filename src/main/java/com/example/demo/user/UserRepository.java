package com.example.demo.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, String>{

    public User findByUserNameAndPassword(String userName , String password);

}
