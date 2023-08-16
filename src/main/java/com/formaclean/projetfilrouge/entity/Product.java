package com.formaclean.projetfilrouge.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    String name;
    @Column
    private String description;
    @Column
    String serialNumber;
    @Column
    private LocalDate purchaseDate;
    @OneToOne
    @JoinColumn(name="trolley.id", foreignKey = @ForeignKey(name ="fk_product_trolley"))
    Trolley trolley;


    public Product(String name, String decription, Trolley trolley){
        this.name=name;
        this.description=description;
        this.trolley=trolley;
    }


    public Product() {

    }
}
