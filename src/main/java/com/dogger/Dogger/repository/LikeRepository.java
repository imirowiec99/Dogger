package com.dogger.Dogger.repository;

import com.dogger.Dogger.model.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LikeRepository extends JpaRepository<Like, Long> {
    public List<Like>findAllByFirstDog(String firstDog);
    public List<Like>findAllBySecondDog(String secondDog);
}
