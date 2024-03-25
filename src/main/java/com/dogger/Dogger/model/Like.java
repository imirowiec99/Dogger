package com.dogger.Dogger.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "liked")
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "accountliked")
    private int account;
    @Column(name = "firstdog")
    private String firstDog;
    @Column(name = "seconddog")
    private String secondDog;
}
