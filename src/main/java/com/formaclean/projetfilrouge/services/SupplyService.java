package com.formaclean.projetfilrouge.services;

import com.formaclean.projetfilrouge.entity.Job;
import com.formaclean.projetfilrouge.entity.Supply;
import com.formaclean.projetfilrouge.repository.SupplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class SupplyService {

    private SupplyRepository supplyRepository;

    @Autowired
    public SupplyService(SupplyRepository supplyRepository){
        this.supplyRepository=supplyRepository;
    }



    public List<Supply> getAllSupplies(){
        return supplyRepository.findAll();
    }

    public Supply createSupply(String name, String description,String serialNumber, LocalDate purchaseDate){
        Supply supply = new Supply(name,description);
        supply.setSerialNumber(serialNumber);
        supply.setPurchaseDate(purchaseDate);
        supplyRepository.save(supply);
        return supply;
    }






}
