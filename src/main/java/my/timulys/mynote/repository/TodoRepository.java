package my.timulys.mynote.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import my.timulys.mynote.domain.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
	// JPA Repository Methods
}
