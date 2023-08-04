package com.formaclean.projetfilrouge.repository;

import com.formaclean.projetfilrouge.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,String> {

}
