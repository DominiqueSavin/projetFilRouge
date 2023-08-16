package com.formaclean.projetfilrouge.repository;

import com.formaclean.projetfilrouge.entity.Supply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplyRepository extends JpaRepository<Supply,Long> {
}
