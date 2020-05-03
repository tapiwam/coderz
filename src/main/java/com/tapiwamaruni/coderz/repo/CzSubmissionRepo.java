package com.tapiwamaruni.coderz.repo;

import com.tapiwamaruni.coderz.entity.CzSubmission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CzSubmissionRepo extends JpaRepository<CzSubmission, Integer> {
}
