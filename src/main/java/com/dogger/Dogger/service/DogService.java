package com.dogger.Dogger.service;

import com.dogger.Dogger.model.Dog;
import com.dogger.Dogger.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService {
    private final DogRepository dogRepository;

    @Autowired
    public DogService(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    public Dog getDog(int id){
        return dogRepository.getDogByAccount(id);
    }

    public List<Dog> getAllDogs(){
        return dogRepository.findAll();
    }

    public long getTopDogIndex(){
        return dogRepository.findTopByOrderByIdDesc().getId();
    }


}
