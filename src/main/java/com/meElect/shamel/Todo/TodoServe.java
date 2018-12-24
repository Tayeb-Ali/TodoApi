package com.meElect.shamel.Todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServe {

//    private List<Todo> data = new ArrayList<>(Arrays.asList(
//            new Todo(1, "Elteyab Ali", "Khartoom sudan"),
//            new Todo(2, "Omer Khalid", "Khartoom sudan"),
//            new Todo(3, "Prof Mustafa", "Khartoom sudan")
//    ));


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

