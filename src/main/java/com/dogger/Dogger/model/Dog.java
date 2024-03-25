package com.dogger.Dogger.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "dog")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "account")
    private int account;
    private String name;
    @Enumerated(EnumType.STRING)
    private Sex sex;
    private String race;
    private int age;
    private int weight;
    private String profile;
    private String city;
    private String description;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="accountinterest", referencedColumnName = "account")
    private List<Interest> interests;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="accountphoto", referencedColumnName = "account")
    private List<Photo> photos;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="accountliked", referencedColumnName = "account")
    private List<Like> likes;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="accountmatch", referencedColumnName = "account")
    private List<Match> matches;

}
