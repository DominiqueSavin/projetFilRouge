package com.formaclean.projetfilrouge.dal.repositories;

import com.formaclean.projetfilrouge.dal.entities.Supply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplyRepository extends JpaRepository<Supply,Long> {
}
