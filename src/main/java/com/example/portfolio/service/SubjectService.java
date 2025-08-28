package com.example.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.portfolio.entity.Subject;
import com.example.portfolio.repository.SubjectRepository;

@Service
public class SubjectService {

    @Autowired
    public SubjectRepository subjectRepository;

    public List<Subject> Getdata() {
        return subjectRepository.findAll();
    }

    public Subject adddata(Subject data) {
        return subjectRepository.save(data);
    }

    public Subject updaSubject(Long id, Subject data) {
        Subject subject = subjectRepository.findById(id).orElse(null);
        if (subject != null) {
            subject.setSubject(data.getSubject());
            subject.setLink(data.getLink());

            return subjectRepository.save(subject);
        }
        return null;
    }

    public void deletedata(Long id) {
        subjectRepository.deleteById(id);
    }

}
