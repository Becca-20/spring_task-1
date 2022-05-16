package com.example.springtask1.repository;

import com.example.springtask1.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog, Long> {
}
