package com.example.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.portfolio.entity.Education;
import com.example.portfolio.repository.EducationRepository;

@Service
public class EducationService {

    @Autowired
    public EducationRepository educationRepository;

    public List<Education> getdata() {
        return educationRepository.findAll();
    }

    public Education createeducation(Education data) {
        return educationRepository.save(data);
    }

    public Education updateeducation(Long id, Education data) {
        Education education = educationRepository.findById(id).orElse(null);

        if (education != null) {

            education.setDegree(data.getDegree());
            education.setImglink(data.getImglink());
            education.setInstitute(data.getInstitute());
            education.setYear(data.getYear());

            return educationRepository.save(education);
        }
        return null;
    }

    public void deletedata(Long id) {
        educationRepository.deleteById(id);
    }

}
