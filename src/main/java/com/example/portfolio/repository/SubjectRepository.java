package com.example.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.portfolio.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {

}
