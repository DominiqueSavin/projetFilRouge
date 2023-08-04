package com.formaclean.projetfilrouge.services;

import com.formaclean.projetfilrouge.repository.TrolleyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class TrolleyService {

    private TrolleyRepository trolleyRepository;

    @Autowired
    TrolleyService(TrolleyRepository trolleyRepository){
        this.trolleyRepository=trolleyRepository;
    }




}
