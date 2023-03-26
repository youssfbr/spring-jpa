package com.github.youssfbr.springdatajpa;

import com.github.youssfbr.springdatajpa.model.User;
import com.github.youssfbr.springdatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {

        User user = new User();
        user.setName("Youssf");
        user.setUsername("youssf");
        user.setPassword("password");

        repository.save(user);

        for (User u : repository.findAll()) {
            System.out.println(u);
        }
    }

}
