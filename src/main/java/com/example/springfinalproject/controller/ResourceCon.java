package com.example.springfinalproject.controller;

import com.example.springfinalproject.entity.Resources;
import com.example.springfinalproject.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resources")
public class ResourceCon {
    @Autowired
    ResourceService resourceService;

    @GetMapping("/list")
    public List<Resources> getAllResources() {
        return resourceService.getAllResources();
    }

    @GetMapping("/find/{id}")
    public Resources getResourceById(@PathVariable("id") Long id) {
        return resourceService.getResourceById(id).get();
    }

    @PostMapping("/create")
    public void addResource(@RequestBody Resources resources) {
        resourceService.addResource(resources);
    }

    @PutMapping("/update/{id}")
    public void updateResource(@PathVariable Long id,
                           @RequestBody Resources resources) {
        resourceService.updateResource(id, resources);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteResource(@PathVariable("id") Long id) {
        resourceService.deleteResource(id);
    }
}
