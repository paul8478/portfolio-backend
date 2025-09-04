package com.example.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.portfolio.entity.Education;

public interface EducationRepository extends JpaRepository<Education, Long> {

}
