package com.formaclean.projetfilrouge.pl.controllers;

import com.formaclean.projetfilrouge.dal.entities.Trolley;
import com.formaclean.projetfilrouge.bl.services.TrolleyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrolleyController {

    private TrolleyService trolleyService;

    @Autowired
    public TrolleyController(TrolleyService trolleyService){
        this.trolleyService=trolleyService;
    }

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //region Mappings
    @GetMapping("/trolleys")
    public List<Trolley> getTrolleys(){
        return trolleyService.getAllTrolleys();
    }
    @PostMapping("/trolleys")
    public Trolley createTrolley(){
        return trolleyService.createTrolley();
    }
    //endregion
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


}
