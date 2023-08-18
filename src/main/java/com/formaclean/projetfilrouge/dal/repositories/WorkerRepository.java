package com.formaclean.projetfilrouge.dal.repositories;

import com.formaclean.projetfilrouge.dal.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends JpaRepository<Worker,Long> {





}
