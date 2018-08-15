package my.timulys.mynote.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import my.timulys.mynote.domain.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
	// JPA Repository Methods
	List<Todo> findAllTodoByCardId(Long cardId);
}
