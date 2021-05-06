package com.zhang.springboot2;

import com.zhang.springboot2.entity.User;
import com.zhang.springboot2.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class Springboot2ApplicationTests {

    @Autowired
    private UserRepository repository;


    @Test
    void contextLoads() {
    }

    @Test
    void save(){
        User book = new User();
        book.setName("Spring Boot");
        book.setName("张三");
        User book1 = repository.save(book);
        System.out.println(book1);
    }
}
