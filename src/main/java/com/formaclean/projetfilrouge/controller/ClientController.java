package com.formaclean.projetfilrouge.controller;

import com.formaclean.projetfilrouge.entities.Client;
import com.formaclean.projetfilrouge.entities.Worker;
import com.formaclean.projetfilrouge.models.forms.ClientCreateForm;
import com.formaclean.projetfilrouge.models.forms.WorkerCreateForm;
import com.formaclean.projetfilrouge.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    private ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService){
        this.clientService=clientService;
    }

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //region Mappings
    @GetMapping("/clients")
    public List<Client> getClients(){
        return clientService.getAllClients();
    }
    @PostMapping("/clients")
    public Client createClient(@Validated @RequestBody ClientCreateForm form){
        return clientService.createClient(form.name());
    }
    //endregion
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++







}
