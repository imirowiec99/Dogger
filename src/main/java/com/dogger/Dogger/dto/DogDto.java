package com.dogger.Dogger.dto;

import com.dogger.Dogger.model.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DogDto {
    private long id;
    private int account;
    private String name;
    private String lastname;
    private List<String> interests;
    private List<MultipartFile> photos;

    @Override
    public String toString() {
        return "DogDto{" +
                "id=" + id +
                ", account=" + account +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", interests=" + interests +
                ", photos=" + photos +
                '}';
    }
}
