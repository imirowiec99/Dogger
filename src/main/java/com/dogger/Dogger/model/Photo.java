package com.dogger.Dogger.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "photo")
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "accountphoto")
    private int account;
    private String name;
    private String filename;
    private String link;
}
