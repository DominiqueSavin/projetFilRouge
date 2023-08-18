package com.formaclean.projetfilrouge.dal.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "clients")
@Data
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String name;


    public Client(String name){
        this.name=name;
    }


    public Client() {

    }
}
