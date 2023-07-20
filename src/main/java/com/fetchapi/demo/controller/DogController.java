package com.fetchapi.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fetchapi.demo.model.Dog;
import com.fetchapi.demo.service.DogService;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping(value = "/dog")
public class DogController {
    
    @Autowired
    DogService dogService;

    @GetMapping("/breeds")
    public Flux<Dog> getBreeds(){
        try {
            return dogService.getBreeds();
        }catch(Exception e){
            e.printStackTrace();
            return Flux.error(new Exception("server error"));
        }
    }
}
