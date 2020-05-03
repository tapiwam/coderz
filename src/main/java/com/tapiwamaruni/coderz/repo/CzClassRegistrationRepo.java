package com.tapiwamaruni.coderz.repo;

import com.tapiwamaruni.coderz.entity.CzClassRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CzClassRegistrationRepo extends JpaRepository<CzClassRegistration, Integer> {
}
