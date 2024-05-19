package com.tms.Task.Management.System.API.repository;

import com.tms.Task.Management.System.API.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
