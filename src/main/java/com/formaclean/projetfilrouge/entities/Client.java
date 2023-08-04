package com.formaclean.projetfilrouge.entities;

import com.formaclean.projetfilrouge.repository.ClientRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.context.annotation.Primary;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    private String name;


    public Client(String name){
        this.name=name;
    }


    public Client() {

    }
}
