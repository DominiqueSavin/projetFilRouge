package com.formaclean.projetfilrouge.dal.repositories;

import com.formaclean.projetfilrouge.dal.entities.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaRepository extends JpaRepository<Area,Long> {
}
