package my.timulys.mynote.service;

import java.util.List;

import my.timulys.mynote.domain.Todo;

public interface TodoService {
	List<Todo> findAllTodoByCardId(Long cardId);
	void saveTodo(Todo todo);
	void deleteTodo(Long todoId);
}
