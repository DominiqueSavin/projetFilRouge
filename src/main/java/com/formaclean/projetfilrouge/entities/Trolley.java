package com.formaclean.projetfilrouge.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "trolleys")
@Getter
@Setter
public class Trolley {

    @Id
    @GeneratedValue
    private int number;

}
