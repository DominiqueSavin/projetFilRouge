package com.formaclean.projetfilrouge.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "workers")
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    String firstName;

    @Column(nullable = false)
    String lastName;


    public Worker(){
        this.setFirstName("John");
        this.setLastName("Doe");
    }
    public Worker(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
