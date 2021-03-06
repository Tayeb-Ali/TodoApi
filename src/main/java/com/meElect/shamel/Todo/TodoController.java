package com.meElect.shamel.Todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v2")
public class TodoController {

    @Autowired
    private TodoServe todoServe;


    @GetMapping(value = {"/todo/", "/todo"})
    public List<Todo> getAllTodoList() {
        return todoServe.findAll();
    }


    @GetMapping({"/todo/{id}", "/todo/{id}/"})
    public Todo getById(@PathVariable String id) {
        return todoServe.getById(id);
    }

    @PostMapping(value = {"/todo/", "/todo/"})
    public Todo createTodo(@RequestBody Todo todo) {
            return todoServe.save(todo);
    }


    @DeleteMapping({"/todo/{id}", "/todo/{id}/"})
    public void deleteTodo(@PathVariable String id) {
        todoServe.delete(id);
    }


}
