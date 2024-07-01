package com.connectproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "company")
@Data
public class CompanyEntity {
    @Id
    @Column(name = "companyId")
    private int companyId;

    @Column(name = "companyName")
    private String companyName;

    @Column(name = "companyAddress")
    private String companyAddress;


}
