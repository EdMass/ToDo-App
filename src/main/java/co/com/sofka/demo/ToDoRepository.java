package co.com.sofka.demo;

import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo, Long> {
}
