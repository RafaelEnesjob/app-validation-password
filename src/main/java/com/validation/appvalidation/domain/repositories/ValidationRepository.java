package com.validation.appvalidation.domain.repositories;

import com.validation.appvalidation.domain.entities.Validation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValidationRepository extends JpaRepository<Validation, Integer> {
}
