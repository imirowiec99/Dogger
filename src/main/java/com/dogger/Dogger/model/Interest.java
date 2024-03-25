package com.dogger.Dogger.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "interest")
@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Interest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "accountinterest")
    private int account;
    private String interest;


}
