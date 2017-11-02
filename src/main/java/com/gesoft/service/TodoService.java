package com.gesoft.service;

import com.gesoft.domain.Todo;
import com.gesoft.mapper.TodoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by WCL on 2017/10/31.
 */
@Service
public class TodoService {
    @Autowired
    private TodoMapper todoMapper;

    public Todo select(int id) {
        return todoMapper.select(id);
    }

    public int insert(String title, String details) {
        Todo todo = new Todo();
        todo.setTitle(title);
        todo.setDetails(details);
        todo.setFinished(1);
        todoMapper.insert(todo);

        return todo.getId();
    }
}
