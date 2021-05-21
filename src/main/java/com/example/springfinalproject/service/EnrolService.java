package com.example.springfinalproject.service;

import com.example.springfinalproject.entity.Enrols;
import com.example.springfinalproject.repository.EnrolRepo;
import com.example.springfinalproject.service.serviceInterface.EnrolServiceIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnrolService implements EnrolServiceIn {
    @Autowired
    private EnrolRepo enrolRepo;

    @Override
    public void addEnrol(Enrols enrols) {
        enrolRepo.saveAndFlush(enrols);
    }

    @Override
    public void deleteEnrol(Long id) {
        enrolRepo.deleteById(id);
    }

    @Override
    public void updateEnrol(Long id, Enrols enrols) {
        enrols.setId(id);
        enrolRepo.saveAndFlush(enrols);
    }

    @Override
    public Optional<Enrols> getEnrolById(Long id) {
        return enrolRepo.findById(id);
    }

    @Override
    public List<Enrols> getAllEnrols() {
        return enrolRepo.findAll();
    }
}
