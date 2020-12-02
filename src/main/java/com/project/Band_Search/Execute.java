package com.project.Band_Search;

import com.project.Band_Search.models.User;
import com.project.Band_Search.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Execute implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Execute.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
       // this.userRepository.deleteAllInBatch();
        for(int i = 0; i < 1000; i++)
            this.userRepository.save(new User( "This is", "Test" +i, "1111", "email@.com"));
     //   this.userRepository.save(new User( "Asd", "FFF", "6456", "aad@.com"));
    }
}

