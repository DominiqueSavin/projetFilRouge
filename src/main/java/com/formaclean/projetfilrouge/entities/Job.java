package com.formaclean.projetfilrouge.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "jobs")
public class Job {

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
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

    @OneToOne
    @JoinColumn(name = "client.name", foreignKey = @ForeignKey(name = "fk_job_client"))
    Client client;

    @ManyToOne
    @JoinColumn(name = "worker.id", foreignKey = @ForeignKey(name = "fk_job_worker"))
    private Worker worker;

    @ManyToOne
    @JoinColumn(name = "trolley.number", foreignKey = @ForeignKey(name = "fk_job_trolley"))
    private Trolley trolley;
    //endregion Attributes
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // region Constructors
    public Job(LocalDate date, Client client){
        this.date=date;
        this.comment=null;
        this.client=client;
    }

    public Job(LocalDate date, String comment, Client client){
        this.date=date;
        this.comment=comment;
        this.client=client;
    }

    public Job() {

    }
    //endregion
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


}
