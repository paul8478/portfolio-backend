package com.example.portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.portfolio.entity.Projects;
import com.example.portfolio.service.ProjectsService;

@Controller
@RestController
@RequestMapping("Project")
@CrossOrigin(origins = "http://localhost:3000")
public class ProjectsController {

    @Autowired
    public ProjectsService projectsService;

    @GetMapping
    public List<Projects> getedata() {
        return projectsService.getdata();
    }

    @PostMapping("/add")
    public Projects createProject(@RequestBody Projects data) {
        return projectsService.createproject(data);
    }

    @PutMapping("/{id}")
    public Projects updateProjects(@PathVariable Long id, @RequestBody Projects data) {
        return projectsService.updateproject(id, data);
    }

    @DeleteMapping("/{id}")
    public void deleteproject(@PathVariable Long id) {
        projectsService.deletedata(id);
    }
}
