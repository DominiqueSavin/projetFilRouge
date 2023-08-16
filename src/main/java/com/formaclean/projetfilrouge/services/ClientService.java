package com.formaclean.projetfilrouge.services;

import com.formaclean.projetfilrouge.entity.Client;
import com.formaclean.projetfilrouge.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private ClientRepository clientRepository;


    @Autowired
    ClientService(ClientRepository clientRepository){
        this.clientRepository=clientRepository;
    }

    public Client createClient(String name){
        Client client = new Client();
        client.setName(name);
        client = clientRepository.save(client);
        return client;
    }

    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }




}
