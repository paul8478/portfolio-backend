package com.example.portfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Projects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String projectname;
    private String img;
    private String title;

    @Lob // lob is for storingg the large text input in db like in form of TEXT or CLOB
    private String Description;
    private String sdescription;
    private String projecttype;
    private String url;

}
