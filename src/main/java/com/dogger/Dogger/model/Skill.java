package com.dogger.Dogger.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "skill")
@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "accountskill")
    private int account;
    private String skill;


}
