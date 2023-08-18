package com.formaclean.projetfilrouge.pl.controllers;

import com.formaclean.projetfilrouge.dal.entities.Area;
import com.formaclean.projetfilrouge.models.forms.AreaCreateForm;
import com.formaclean.projetfilrouge.bl.services.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AreaController {

    private AreaService areaService;

    @Autowired
    public AreaController(AreaService areaService){
        this.areaService=areaService;
    }


    @GetMapping("/areas")
    public List<Area> getJobs(){
        return areaService.getAllAreas();
    }
    @PostMapping("/areas")
    public Area createArea(@Validated @RequestBody AreaCreateForm form){
        return areaService.createArea(form.name(), form.clientName());
    }






}
