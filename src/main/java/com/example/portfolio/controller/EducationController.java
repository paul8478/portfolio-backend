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

import com.example.portfolio.entity.Education;
import com.example.portfolio.service.EducationService;

@Controller
@RestController
@RequestMapping("education")
@CrossOrigin(origins = "https://spaul.vercel.app/")
public class EducationController {

    @Autowired
    public EducationService educationService;

    @GetMapping
    public List<Education> getAllEducation() {
        return educationService.getdata();
    }

    @PostMapping
    public Education createEducation(@RequestBody Education education) {
        return educationService.createeducation(education);
    }

    @PutMapping("/{id}")
    public Education updateEducation(@PathVariable Long id, @RequestBody Education education) {
        return educationService.updateeducation(id, education);
    }

    @DeleteMapping("/{id}")
    public void deleteEducation(@PathVariable Long id) {
        educationService.deletedata(id);
    }
}
