package com.example.springfinalproject.service.serviceInterface;

import com.example.springfinalproject.entity.Enrols;

import java.util.List;
import java.util.Optional;

public interface EnrolServiceIn {
    void addEnrol(Enrols enrols);
    void deleteEnrol(Long id);
    void updateEnrol(Long id, Enrols enrols);
    Optional<Enrols> getEnrolById(Long id);
    List<Enrols> getAllEnrols();
}
