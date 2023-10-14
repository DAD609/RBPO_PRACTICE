package ru.company.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.company.app.model.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
