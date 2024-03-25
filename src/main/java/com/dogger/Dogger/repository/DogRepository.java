package com.dogger.Dogger.repository;

import com.dogger.Dogger.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DogRepository extends JpaRepository<Dog, Long> {
    public Dog getDogByAccount(int id);
    public Dog findTopByOrderByIdDesc();
}
