package com.formaclean.projetfilrouge.repository;

import com.formaclean.projetfilrouge.entities.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaRepository extends JpaRepository<Area,Long> {
}