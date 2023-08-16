package com.formaclean.projetfilrouge.repository;

import com.formaclean.projetfilrouge.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {
}
