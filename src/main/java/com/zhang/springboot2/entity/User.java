package com.zhang.springboot2.entity;

import lombok.Data;
import org.springframework.boot.context.properties.bind.Name;
import javax.persistence.Id;
import javax.persistence.Entity;

@Data
@Entity
public class User {
    @Id
    private Integer id;
    private String name;
    private String password;

}
