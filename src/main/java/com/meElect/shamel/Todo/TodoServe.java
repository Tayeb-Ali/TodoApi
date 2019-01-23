package com.meElect.shamel.Todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServe {


    @Autowired
    private TodoRepository todoRepository;
    public List<Todo> findAll() {
        return todoRepository.findAll();
    }


    public Todo getById(String id) {
     return todoRepository.findById(id).get();
    }

    public Todo save(Todo todo){
        return todoRepository.insert(todo);
    }

    public void delete(String id){
       todoRepository.deleteById(id);
    }
}

