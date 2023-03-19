package com.foltan.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foltan.todoapp.models.TodoItem;

@Repository
public interface TodoItemRepository extends JpaRepository<TodoItem,Long>{
    
}
