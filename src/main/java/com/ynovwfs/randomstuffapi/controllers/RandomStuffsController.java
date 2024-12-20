package com.ynovwfs.randomstuffapi.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.ynovwfs.randomstuffapi.models.RandomStuff;
import com.ynovwfs.randomstuffapi.repositories.RandomStuffsRepository;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin("http://localhost:3000")
@RestController
public class RandomStuffsController {
    private final RandomStuffsRepository randomStuffsRepository;

    public RandomStuffsController(RandomStuffsRepository randomStuffsRepository) {
        this.randomStuffsRepository = randomStuffsRepository;
    }

    @GetMapping("/stuff")
    public List<RandomStuff> all() {
        return randomStuffsRepository.findAll();
    }
}
