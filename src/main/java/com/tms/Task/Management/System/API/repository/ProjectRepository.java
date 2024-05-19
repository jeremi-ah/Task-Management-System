package com.tms.Task.Management.System.API.repository;

import com.tms.Task.Management.System.API.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
