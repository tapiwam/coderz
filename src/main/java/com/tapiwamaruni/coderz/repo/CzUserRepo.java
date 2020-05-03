package com.tapiwamaruni.coderz.repo;

import com.tapiwamaruni.coderz.entity.CzUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CzUserRepo extends JpaRepository<CzUser, Integer> {
}
