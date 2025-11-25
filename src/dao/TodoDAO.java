package dao;

import java.util.List;
import model.Todo;

public interface TodoDAO {
    List<Todo> getAll() throws Exception;
    Todo getById(String id) throws Exception;
    void add(Todo todo) throws Exception;
    void update(Todo todo) throws Exception;
    void delete(String id) throws Exception;
}
