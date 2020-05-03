package com.tapiwamaruni.coderz.repo;

import com.tapiwamaruni.coderz.entity.CzClassInstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CzClassInstructorRepo extends JpaRepository<CzClassInstructor, Integer> {
}
