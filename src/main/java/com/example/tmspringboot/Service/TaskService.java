package com.example.tmspringboot.Service;

import com.example.tmspringboot.model.Task;

import java.util.List;

public interface TaskService {

    List<Task>getAllTasks();
    List <Task> findByFinished();
    Task getTaskById();
    Task updateTask(Task task ,long id);
    void deleteTask(long id);
}
