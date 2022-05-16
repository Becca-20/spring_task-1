package com.example.springtask1.controller;

import com.example.springtask1.model.Dog;
import com.example.springtask1.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {

    @Autowired
    private DogService dogService;

    @GetMapping("/dogs")
    public List<Dog> getAll(){
        return dogService.getAll();
    }

    @PostMapping("/dogs")
    public Dog post(@RequestBody Dog dog) {
        return dogService.save(dog);
    }

}
