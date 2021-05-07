package com.zhang.springboot2.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CaseItemRepositoryTest {
    @Autowired
    private CaseItemRepository caseItemRepository;
    @Test
    void findAll(){
        System.out.println(caseItemRepository.findAll());
    }
}