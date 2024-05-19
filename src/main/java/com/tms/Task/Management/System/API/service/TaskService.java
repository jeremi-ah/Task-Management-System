package com.tms.Task.Management.System.API.service;

import com.tms.Task.Management.System.API.model.Task;
import com.tms.Task.Management.System.API.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public Task createTask(Task task){
        return taskRepository.save(task);
    }

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }
    public Optional<Task> getTaskById(Long id){
        return taskRepository.findById(id);

    }
    public Task updateTask(Task task){
        return taskRepository.save(task);
    }
    public void deleteTaskById(Long id){
        taskRepository.deleteById(id);
    }
}
