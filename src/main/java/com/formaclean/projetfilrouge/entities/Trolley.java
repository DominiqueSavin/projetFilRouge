package com.formaclean.projetfilrouge.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "trolleys")
public class Trolley {

    @Id
    private int number;

}
