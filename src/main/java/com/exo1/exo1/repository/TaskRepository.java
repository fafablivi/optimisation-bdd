package com.exo1.exo1.repository;

import com.exo1.exo1.entity.Task;
import lombok.NonNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    @EntityGraph(attributePaths = {"projet", "user"})
    @NonNull
    Page<Task> findAll(Pageable pageable);
}
