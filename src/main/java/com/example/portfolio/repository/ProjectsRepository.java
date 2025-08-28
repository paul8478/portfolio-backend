package com.example.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.portfolio.entity.Projects;

public interface ProjectsRepository extends JpaRepository<Projects, Long> {

}
