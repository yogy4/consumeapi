package com.fetchapi.demo.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.fetchapi.demo.model.Dog;
import reactor.core.publisher.Flux;

@Service
public class DogService {

    // @Autowired
    // WebClient webClient;
    
    
    private static final Logger logger = LogManager.getLogger(DogService.class);
    private final WebClient webClient;

    // add singleton pattern
    public DogService(WebClient.Builder webClientBuilder){
        this.webClient = webClientBuilder.baseUrl("https://dog.ceo/api/").build();
    }
   
    // public Flux<Dog> getBreeds(){
    //     return webClient.get()
    //             .uri("https://dog.ceo/api/breeds/list/all")
    //             .retrieve()
    //             .bodyToFlux(Dog.class)
    //             .doOnError(throwable -> logger.error("Failed for some reason", throwable));
    // }
        
    public Flux<Dog> getBreeds(){
        return this.webClient.get().uri("/breeds/list/all").retrieve().bodyToFlux(Dog.class).doOnError(throwable -> logger.error("Failed for some reason", throwable));
    }
    
}
