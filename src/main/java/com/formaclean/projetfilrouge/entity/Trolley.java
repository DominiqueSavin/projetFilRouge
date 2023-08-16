package com.formaclean.projetfilrouge.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Data
@Table(name = "trolleys")

public class Trolley {

    @Id
    @GeneratedValue
    private int number;

    @ManyToMany
    @JoinColumn(name = "product.id", foreignKey = @ForeignKey(name ="fk_trolley_product"))
    private List<Product> productList;
    @ManyToMany
    @JoinColumn(name = "supply.id", foreignKey = @ForeignKey(name ="fk_trolley_supply"))
    private List<Product> supplyList;





}
