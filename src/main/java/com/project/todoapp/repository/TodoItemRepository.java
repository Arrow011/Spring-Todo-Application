package com.project.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.todoapp.models.TodoItem;

@Repository
public interface TodoItemRepository extends JpaRepository<TodoItem,Long>{
    
}
