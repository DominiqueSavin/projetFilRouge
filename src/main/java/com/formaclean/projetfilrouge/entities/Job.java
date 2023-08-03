package com.formaclean.projetfilrouge.entities;

import com.formaclean.projetfilrouge.tbd.Client;
import com.formaclean.projetfilrouge.tbd.Worker;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

public class Job {


    @Id
    @GeneratedValue
    private final Long id;

    LocalDate date;
    int duration;
    boolean picture;
    String comment;
    Client client;
    Worker worker;






    public Job(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }
}
