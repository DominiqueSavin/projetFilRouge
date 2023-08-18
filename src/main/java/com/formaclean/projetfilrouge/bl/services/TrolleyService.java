package com.formaclean.projetfilrouge.bl.services;

import com.formaclean.projetfilrouge.dal.entities.Product;
import com.formaclean.projetfilrouge.dal.entities.Trolley;
import com.formaclean.projetfilrouge.dal.repositories.TrolleyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrolleyService {

    private TrolleyRepository trolleyRepository;

    @Autowired
    TrolleyService(TrolleyRepository trolleyRepository){
        this.trolleyRepository=trolleyRepository;
    }

    public List<Trolley> getAllTrolleys(){
        return trolleyRepository.findAll();
    }

    public Trolley createTrolley(){
        Trolley trolley = new Trolley();
        trolleyRepository.save(trolley);
        return trolley;
    }

    public void reportMissingProduct(Product product, Trolley trolley){
        trolley.getProductList().remove(product);


    }






}
