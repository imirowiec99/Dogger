package com.dogger.Dogger.dto;

import jakarta.persistence.*;
import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PhotoDto {
    private int account;
    private String name;
    private String filename;
    private String link;
}
