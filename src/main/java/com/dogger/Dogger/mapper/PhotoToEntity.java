package com.dogger.Dogger.mapper;

import com.dogger.Dogger.dto.PhotoDto;
import com.dogger.Dogger.model.Photo;

public class PhotoToEntity {
    private PhotoDto photoDto;

    public PhotoToEntity(PhotoDto photoDto) {
        this.photoDto = photoDto;
    }
    public static Photo photoDtoToEntity(PhotoDto photoDto){
        Photo photo = new Photo();
        photo.setLink(photoDto.getLink());
        photo.setFilename(photoDto.getFilename());
        photo.setAccount(photoDto.getAccount());
        photo.setName(photoDto.getName());
        return photo;
    }
}
