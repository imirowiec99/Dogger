package com.dogger.Dogger.service;

import com.dogger.Dogger.model.Photo;
import com.dogger.Dogger.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {
    private final PhotoRepository photoRepository;

    @Autowired

    public PhotoService(PhotoRepository photoRepository) {
        this.photoRepository = photoRepository;
    }

    public void savePhoto(Photo photo){
        photoRepository.save(photo);
    }
    public Photo getPhoto(long id){
        return photoRepository.getReferenceById(id);
    }

    public List<Photo> getAllPhotos(){
        return photoRepository.findAll();
    }

    public List<Photo> getPhotosByAccountId(int account){
        return photoRepository.getPhotoByAccount(account);
    }
}
