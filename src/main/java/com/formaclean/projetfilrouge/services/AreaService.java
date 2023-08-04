package com.formaclean.projetfilrouge.services;

import com.formaclean.projetfilrouge.entities.Area;
import com.formaclean.projetfilrouge.entities.Client;
import com.formaclean.projetfilrouge.repository.AreaRepository;
import com.formaclean.projetfilrouge.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaService {

    private AreaRepository areaRepository;
    private final ClientRepository clientRepository;

    @Autowired
    public AreaService(AreaRepository areaRepository, ClientRepository clientRepository){
        this.areaRepository=areaRepository;
        this.clientRepository=clientRepository;
    }

    public List<Area> getAllAreas(){
        return areaRepository.findAll();
    }

    public Area createArea (String name, String clientName){
        Client client = this.clientRepository.findById(clientName) .orElseThrow();
        Area area = new Area(name,client);
        this.areaRepository.save(area);
        return area;
    }





}
