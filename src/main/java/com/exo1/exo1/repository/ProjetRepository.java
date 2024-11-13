package com.exo1.exo1.repository;

import com.exo1.exo1.entity.Projet;
import lombok.NonNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProjetRepository extends JpaRepository<Projet, Long> {
    @EntityGraph(attributePaths = {"users", "tasks"})
    @NonNull
    Page<Projet> findAll(Pageable pageable);
}
