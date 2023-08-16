package com.formaclean.projetfilrouge.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "tasks")
public class Task {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;
    @Column
    private LocalDate lastDone;
    @Column
    private TaskType type;


    public Task(String name,TaskType type){
        this.name=name;
        this.type=type;
    }


    public Task() {

    }
}
