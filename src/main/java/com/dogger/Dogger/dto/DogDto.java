package com.dogger.Dogger.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DogDto {
    private int account;
    private String name;
    private String race;
    private String sex;
    private String description;
    private int age;
    private int weight;
    private String city;
    private List<SkillDto> skills;
    private List<PhotoDto> photos;

    @Override
    public String toString() {
        return "DogDto{" +
                "account=" + account +
                ", name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", sex='" + sex + '\'' +
                ", description='" + description + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", city='" + city + '\'' +
                ", skills=" + skills +
                ", photos=" + photos +
                '}';
    }
}
