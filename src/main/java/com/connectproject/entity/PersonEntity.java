package com.connectproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "person")
@Data
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "personId")
    private int personId;

    @Column(name = "fullName", length = 100)
    private String fullName;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "password", length = 50)
    @JsonIgnore
    private String password;

    @Column(name = "registrationDate")
    @CreationTimestamp
    private Timestamp registrationDate;

    @Column(name = "companyName", length = 100)
    private String companyName;

    @Column(name = "jobTitle", length = 100)
    private String jobTitle;

    @Column(name = "jobDomain", length = 100)
    private String jobDomain;

    @Column(name = "jobExperience")
    private int jobExperience;

    @Column(name = "skills")
    private List<String> skills;

    @Column(name = "personIntroduction")
    private String personIntroduction;

}
