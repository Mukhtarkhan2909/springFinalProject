package com.example.springfinalproject.controller;

import com.example.springfinalproject.entity.Enrols;
import com.example.springfinalproject.service.EnrolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enrols")
public class EnrolCon {
    @Autowired
    EnrolService enrolService;

    @GetMapping("/list")
    public List<Enrols> getAllEnrols() {
        return enrolService.getAllEnrols();
    }

    @GetMapping("/find/{id}")
    public Enrols getEnrolById(@PathVariable("id") Long id) {
        return enrolService.getEnrolById(id).get();
    }

    @PostMapping("/create")
    public void addEnrol(@RequestBody Enrols enrols) {
        enrolService.addEnrol(enrols);
    }

    @PutMapping("/update/{id}")
    public void updateEnrol(@PathVariable Long id,
                           @RequestBody Enrols enrols) {
        enrolService.updateEnrol(id, enrols);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEnrol(@PathVariable("id") Long id) {
        enrolService.deleteEnrol(id);
    }
}
