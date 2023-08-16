package com.formaclean.projetfilrouge.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

@Entity
@Data
@Table(name="supplies")
public class Supply {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    @Column
    private String name;

    @Column
    private String description;
    @Column
    private String serialNumber;
    @Column
    private LocalDate purchaseDate;


    public Supply(String name, String description){
        this.name=name;
        this.description=description;
    }


    public Supply() {

    }
}
