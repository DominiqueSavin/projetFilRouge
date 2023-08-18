package com.formaclean.projetfilrouge.dal.entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "areas")
public class Area {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "client_id", foreignKey = @ForeignKey(name="client.id"))
    private Client client;




    public Area(String name, Client client){
        this.name=name;
        this.client=client;
    }


    public Area() {

    }
}
