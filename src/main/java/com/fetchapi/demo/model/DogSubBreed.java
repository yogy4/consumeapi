package com.fetchapi.demo.model;

import java.util.List;

public class DogSubBreed {
    Breed breed;
    List<SubBreed> subBreeds;
    public Breed getBreed() {
        return breed;
    }
    public void setBreed(Breed breed) {
        this.breed = breed;
    }
    public List<SubBreed> getSubBreeds() {
        return subBreeds;
    }
    public void setSubBreeds(List<SubBreed> subBreeds) {
        this.subBreeds = subBreeds;
    }

    
}
