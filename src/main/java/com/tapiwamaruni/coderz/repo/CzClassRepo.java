package com.tapiwamaruni.coderz.repo;

import com.tapiwamaruni.coderz.entity.CzClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CzClassRepo extends JpaRepository<CzClass, Integer> {
}
