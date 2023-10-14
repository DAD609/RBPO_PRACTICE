package ru.company.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.company.app.model.entity.Employee;
import ru.company.app.model.entity.Project;
import ru.company.app.model.entity.Task;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findAllByEmployeeId(long employeeId);
}
