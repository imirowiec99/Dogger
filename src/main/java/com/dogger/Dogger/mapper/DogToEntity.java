package com.dogger.Dogger.mapper;

import com.dogger.Dogger.dto.DogDto;
import com.dogger.Dogger.model.Dog;
import com.dogger.Dogger.model.Sex;

public class DogToEntity {
    private DogDto dogDto;

    public DogToEntity(DogDto dogDto) {
        this.dogDto = dogDto;
    }

    public static Dog dogDtoToEntity(DogDto dogDto){
        Dog dog = new Dog();
        dog.setAccount(dogDto.getAccount());
        dog.setName(dogDto.getName());
        dog.setRace(dogDto.getRace());
        dog.setSex(dogDto.getSex());
        dog.setDescription(dogDto.getDescription());
        dog.setCity(dogDto.getCity());
        dog.setAge(dogDto.getAge());
        dog.setWeight(dogDto.getWeight());
        return dog;
    }
}
