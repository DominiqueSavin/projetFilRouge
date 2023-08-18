package com.formaclean.projetfilrouge.dal.repositories;

import com.formaclean.projetfilrouge.dal.entities.Trolley;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrolleyRepository extends JpaRepository<Trolley,Integer> {
}