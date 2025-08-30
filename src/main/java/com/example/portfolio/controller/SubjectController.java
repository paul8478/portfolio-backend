package com.example.portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.portfolio.entity.Subject;
import com.example.portfolio.service.SubjectService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RestController
@RequestMapping("subject")
@CrossOrigin(origins = "https://spaul.vercel.app/")
public class SubjectController {

    @Autowired
    public SubjectService subjectService;

    @GetMapping
    public List<Subject> getalldata() {
        return subjectService.Getdata();
    }

    @PostMapping("/add")
    public Subject Adddata(@RequestBody Subject data) {
        return subjectService.adddata(data);
    }

    @PutMapping("/{id}")
    public Subject updatedata(@PathVariable Long id, @RequestBody Subject data) {

        return subjectService.updaSubject(id, data);
    }

    @DeleteMapping("/{id}")
    public void deletedata(@PathVariable Long id) {
        subjectService.deletedata(id);
    }

}
