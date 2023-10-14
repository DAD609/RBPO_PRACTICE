package ru.company.app.service;

import org.springframework.stereotype.Service;
import ru.company.app.model.entity.Employee;
import ru.company.app.model.entity.Project;
import ru.company.app.repository.EmployeeRepository;
import ru.company.app.repository.ProjectRepository;

import java.util.List;

@Service
public class ProjectController {

    private final ProjectRepository projectRepository;

    public ProjectController(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> getAll() {
        return projectRepository.findAll();
    }

    public void add(Project project) {
        projectRepository.save(project);
    }

}
