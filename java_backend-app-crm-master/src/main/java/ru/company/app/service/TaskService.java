package ru.company.app.service;

import org.springframework.stereotype.Service;
import ru.company.app.model.entity.Task;
import ru.company.app.repository.TaskRepository;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    public List<Task> getByEmployeeId(long employeeId) {
        return taskRepository.findAllByEmployeeId(employeeId);
    }
}
