package com.example.springfinalproject.service.serviceInterface;

import com.example.springfinalproject.entity.Resources;

import java.util.List;
import java.util.Optional;

public interface ResourceServiceIn {
    void addResource(Resources resources);
    void deleteResource(Long id);
    void updateResource(Long id, Resources resources);
    Optional<Resources> getResourceById(Long id);
    List<Resources> getAllResources();
}
