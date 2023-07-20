package com.fetchapi.demo.model;

import java.util.List;

public class Dog {
    Breed breed;
    List<SubBreed> subBreeds;
    List<Country> countries;
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
    public List<Country> getCountries() {
        return countries;
    }
    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    

    
}
