package com.zhang.springboot2.controller;

import com.zhang.springboot2.entity.User;
import com.zhang.springboot2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserHandler {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/findAll/{page}/{size}")
    public Page<User> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        PageRequest request = PageRequest.of(page-1,size);
        return userRepository.findAll(request);
    }
    @PostMapping("/save")
    public String save(@RequestBody User user){
        User result = userRepository.save(user);
        if(result != null)
        {
            return "success";
        }else {
            return "error";
        }
    }
    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") Integer id){
        return userRepository.findById(id).get();
    }


    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        userRepository.deleteById(id);
    }
}
