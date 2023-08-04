package com.formaclean.projetfilrouge.entities;

import com.formaclean.projetfilrouge.repository.ClientRepository;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "clients")
public class Client implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    @Column(unique = true)
    private String name;


    public Client(String name){
        this.name=name;
    }


    public Client() {

    }
}
