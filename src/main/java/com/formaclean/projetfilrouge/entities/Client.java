package com.formaclean.projetfilrouge.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Client {
    @Id
    private String name;
}
