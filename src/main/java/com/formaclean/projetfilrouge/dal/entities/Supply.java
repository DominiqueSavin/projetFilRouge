package com.formaclean.projetfilrouge.dal.entities;

import jakarta.persistence.*;
import lombok.Data;

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

    @OneToOne
    @JoinColumn(name="trolley.id", foreignKey =@ForeignKey(name="fk_supply_trolley"))
    private Trolley trolley;


    public Supply(String name, String description){
        this.name=name;
        this.description=description;
    }


    public Supply() {

    }


    public void allocateProduct(Trolley trolley){
            this.trolley=trolley;
    }

    public void transferProductToStock(){
        this.trolley=null;
    }
}
