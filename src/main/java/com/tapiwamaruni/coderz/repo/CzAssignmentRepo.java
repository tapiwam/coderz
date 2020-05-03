package com.tapiwamaruni.coderz.repo;

import com.tapiwamaruni.coderz.entity.CzAssignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CzAssignmentRepo extends JpaRepository<CzAssignment, Integer> {
}
