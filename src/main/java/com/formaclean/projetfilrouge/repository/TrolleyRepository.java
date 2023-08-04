package com.formaclean.projetfilrouge.repository;

import com.formaclean.projetfilrouge.entities.Trolley;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrolleyRepository extends JpaRepository<Trolley,Integer> {
}
