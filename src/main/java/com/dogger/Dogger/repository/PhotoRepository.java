package com.dogger.Dogger.repository;

import com.dogger.Dogger.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long> {
    public List<Photo> getPhotoByAccount(int account);
}
