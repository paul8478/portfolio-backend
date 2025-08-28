package com.example.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.portfolio.entity.Projects;
import com.example.portfolio.repository.ProjectsRepository;

@Service
public class ProjectsService {

    @Autowired
    public ProjectsRepository projectsRepository;

    public List<Projects> getdata() {
        return projectsRepository.findAll();
    }

    public Projects createproject(Projects data) {
        return projectsRepository.save(data);
    }

    public Projects updateproject(Long id, Projects data) {
        Projects project = projectsRepository.findById(id).orElse(null);

        if (project != null) {

            project.setDescription(data.getDescription());
            project.setImg(data.getImg());
            project.setProjectname(data.getProjectname());
            project.setProjecttype(data.getProjecttype());
            project.setSdescription(data.getSdescription());
            project.setTitle(data.getTitle());
            project.setUrl(data.getUrl());

            return projectsRepository.save(project);
        }
        return null;
    }

    public void deletedata(Long id) {
        projectsRepository.deleteById(id);
    }
}
