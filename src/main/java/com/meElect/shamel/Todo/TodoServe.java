package com.meElect.shamel.Todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TodoServe {

    private List<Todo> data = new ArrayList<>(Arrays.asList(
            new Todo(1, "Elteyab Ali", "Khartoom sudan"),
            new Todo(2, "Omer Khalid", "Khartoom sudan"),
            new Todo(3, "Prof Mustafa", "Khartoom sudan")
    ));


    public List<Todo> findAll() {
        return data;
    }

    public Todo getById(int id) {
        for (Todo todo : data) {
            if (todo.getId() == id) return todo;
        }
        return null;
    }

    public boolean save(Todo todo){
        return  data.add(todo);
    }

    public void delete(int id){
        for (Todo todo: data){
            if (todo.getId()== id){
                data.remove(todo);
            }
        }
    }
}

