package com.connectproject.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "friends")
@Data
public class FriendsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "sendDate")
    private Timestamp sendDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "firstUserId", referencedColumnName = "personId")
    PersonEntity firstUser;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "secondUserId", referencedColumnName = "personId")
    PersonEntity secondUser;

    @Column(name = "acceptedDate")
    private Timestamp acceptedDate;
}
