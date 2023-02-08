package com.project.todoapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.project.todoapp.models.TodoItem;
import com.project.todoapp.repository.TodoItemRepository;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class TodoItemDataLoader implements CommandLineRunner{

    @Autowired
    TodoItemRepository todoItemRepository;

    @Override
    public void run(String... args) throws Exception {
        loadSeedData();
    }

    public void loadSeedData(){
        if(todoItemRepository.count() == 0){
            TodoItem item1 = new TodoItem("CRUD TODO APP");
            TodoItem item2 = new TodoItem("CRUD MOVIE REVIEW");
            todoItemRepository.save(item1);
            todoItemRepository.save(item2);
        }

        log.info("no of todo item : {}",todoItemRepository.count());
    }
    
}
