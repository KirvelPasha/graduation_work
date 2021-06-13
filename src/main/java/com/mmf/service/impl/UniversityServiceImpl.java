package com.mmf.service.impl;

import com.mmf.dao.entity.University;
import com.mmf.dao.repository.UniversityRepository;
import com.mmf.service.interfaces.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityServiceImpl implements UniversityService {
    private final UniversityRepository universityRepository;

    @Autowired
    public UniversityServiceImpl(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }


    @Override
    public List<University> getAll() {
        return universityRepository.findAll();
    }
}
