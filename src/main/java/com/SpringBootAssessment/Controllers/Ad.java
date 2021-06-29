package com.SpringBootAssessment.Controllers;

import javax.persistence.*;

@Entity
@Table(name="ads")
public class Ad {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //This is for all ads to have a ad.title
    @Column(nullable = false, length = 100)
    private String title;


    //This is for all ads to have a ad.description
    @Column(nullable = false, length = 200)
    private String description;





    //Constructors

    public Ad() {
    }

    ///Getters and Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

