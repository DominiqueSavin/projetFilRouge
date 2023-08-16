package com.formaclean.projetfilrouge.controller;

import com.formaclean.projetfilrouge.entity.Job;
import com.formaclean.projetfilrouge.entity.Supply;
import com.formaclean.projetfilrouge.models.forms.JobCreateForm;
import com.formaclean.projetfilrouge.models.forms.SupplyCreateForm;
import com.formaclean.projetfilrouge.services.SupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class SupplyController {

    private SupplyService supplyService;

    @Autowired
    public SupplyController(SupplyService supplyService){
        this.supplyService=supplyService;
    }


    @GetMapping("/supplies")
    public List<Supply> getSupplies(){
        return supplyService.getAllSupplies();
    }
    @PostMapping("/supplies")
    public Supply createSupply(@Validated @RequestBody SupplyCreateForm form){
        return supplyService.createSupply(form.name(), form.description(), form.serialNumber(),form.purchaseDate());
    }





}
