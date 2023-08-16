package com.formaclean.projetfilrouge.entity;
//region Imports
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
//endregion

@Entity
@Getter
@Setter
@Table(name = "workers")
public class Worker {
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //region Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "firstName")
    String firstName;

    @Column(name= "lastName", nullable = false)
    String lastName;
    //endregion Attributes
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //region Constructors
    public Worker(){
        this.setFirstName("John");
        this.setLastName("Doe");
    }
    public Worker(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //endregion
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
}
