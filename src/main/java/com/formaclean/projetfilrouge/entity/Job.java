package com.formaclean.projetfilrouge.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "jobs")
public class Job {


    //region Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long number;

    @Column
    private LocalDate date;

    @Column
    private int duration;

    @Column
    private String urlPhoto;

    @Column
    private String comment;

    @ManyToOne
    @JoinColumn(name = "client.id", foreignKey = @ForeignKey(name = "fk_job_client"))
    private Client client;

    @ManyToOne
    @JoinColumn(name = "worker.id", foreignKey = @ForeignKey(name = "fk_job_worker"))
    private Worker worker;

    @ManyToOne
    @JoinColumn(name = "trolley.number", foreignKey = @ForeignKey(name = "fk_job_trolley"))
    private Trolley trolley;

    @ManyToMany
    @JoinColumn(name="task.id", foreignKey = @ForeignKey(name = "fk_job_task"))
    private List<Task> taskList;
    //endregion Attributes

    // region Constructors


    public Job(LocalDate date, String comment, Client client){
        this.date=date;
        this.comment=comment;
        this.client=client;
    }

    public Job() {

    }
    //endregion



}
