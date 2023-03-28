package com.example.tmspringboot.repository;

import com.example.tmspringboot.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository <Task, Long>{

    List<Task> findByFinished(boolean finished);
    List<Task> findByTitleContaining( String title);
}
