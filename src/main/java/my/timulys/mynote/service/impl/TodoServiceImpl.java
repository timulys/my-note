package my.timulys.mynote.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.timulys.mynote.domain.Todo;
import my.timulys.mynote.repository.TodoRepository;
import my.timulys.mynote.service.TodoService;

@Service
public class TodoServiceImpl implements TodoService {
	@Autowired
	private TodoRepository todoRepository;
	
	@Override
	public List<Todo> findAllTodoByCardId(Long cardId) {
		List<Todo> todoList = todoRepository.findAllTodoByCardId(cardId);
		return todoList;
	}

	@Override
	public void saveTodo(Todo todo) {
		todoRepository.save(todo);
	}

	@Override
	public void deleteTodo(Long todoId) {
		todoRepository.deleteById(todoId);
	}

}
