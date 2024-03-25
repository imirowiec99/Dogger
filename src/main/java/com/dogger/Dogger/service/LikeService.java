package com.dogger.Dogger.service;

import com.dogger.Dogger.model.Dog;
import com.dogger.Dogger.model.Like;
import com.dogger.Dogger.repository.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LikeService {
    private final LikeRepository likeRepository;

    @Autowired
    public LikeService(LikeRepository likeRepository) {
        this.likeRepository = likeRepository;
    }

    public List<String> givenLikes(String firstDog){
        List<Like> likes = likeRepository.findAllByFirstDog(firstDog);
        return likes.stream()
                .map(Like::getSecondDog)
                .collect(Collectors.toList());
    }

    public List<String> returnedLikes(String secondDog){
        List<Like> likes = likeRepository.findAllBySecondDog(secondDog);
        return likes.stream()
                .map(Like::getFirstDog)
                .collect(Collectors.toList());
    }
}
