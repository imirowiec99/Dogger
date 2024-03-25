package com.dogger.Dogger.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "match")
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "accountmatch")
    private int account;
    private String firstDog;
    private String secondDog;
}
