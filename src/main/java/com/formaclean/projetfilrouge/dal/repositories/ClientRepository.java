package com.formaclean.projetfilrouge.dal.repositories;

import com.formaclean.projetfilrouge.dal.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client,String> {



    @Query(value = "SELECT c FROM clients c WHERE c.name = :name")
       Optional<Client> findByName(@Param("name") String name);
}
