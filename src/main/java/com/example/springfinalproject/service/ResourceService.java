package com.example.springfinalproject.service;

import com.example.springfinalproject.entity.Resources;
import com.example.springfinalproject.repository.ResourceRepo;
import com.example.springfinalproject.service.serviceInterface.ResourceServiceIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResourceService implements ResourceServiceIn {
    @Autowired
    private ResourceRepo resourceRepo;

    @Override
    public void addResource(Resources resources) {
        resourceRepo.saveAndFlush(resources);
    }

    @Override
    public void deleteResource(Long id) {
        resourceRepo.deleteById(id);
    }

    @Override
    public void updateResource(Long id, Resources resources) {
        resources.setId(id);
        resourceRepo.saveAndFlush(resources);
    }

    @Override
    public Optional<Resources> getResourceById(Long id) {
        return resourceRepo.findById(id);
    }

    @Override
    public List<Resources> getAllResources() {
        return resourceRepo.findAll();
    }
}
