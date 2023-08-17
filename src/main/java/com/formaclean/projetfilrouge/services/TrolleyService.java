package com.formaclean.projetfilrouge.services;

import com.formaclean.projetfilrouge.entity.Product;
import com.formaclean.projetfilrouge.entity.Trolley;
import com.formaclean.projetfilrouge.repository.TrolleyRepository;
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
