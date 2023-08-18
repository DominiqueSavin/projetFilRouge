package com.formaclean.projetfilrouge.dal.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "trolleys")

public class Trolley {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int number;

    @ManyToMany
    @JoinColumn(name = "product.id", foreignKey = @ForeignKey(name ="fk_trolley_product"))
    private List<Product> productList;
    @ManyToMany
    @JoinColumn(name = "supply.id", foreignKey = @ForeignKey(name ="fk_trolley_supply"))
    private List<Product> supplyList;





}
