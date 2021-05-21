package com.example.springfinalproject.repository;

import com.example.springfinalproject.entity.Resources;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ResourceRepo extends JpaRepository<Resources, Long> {
    @NotNull
    List<Resources> findAll();
    @NotNull
    Optional<Resources> findById(@NotNull Long id);
}
