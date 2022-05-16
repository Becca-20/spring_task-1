package com.example.springtask1.service;

import com.example.springtask1.model.Dog;
import com.example.springtask1.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService {

    @Autowired
    private DogRepository dogRepository;

    public List<Dog> getAll(){
        return dogRepository.findAll();
    }

    public Dog save(Dog dog) {
        return dogRepository.save(dog);
    }
}
