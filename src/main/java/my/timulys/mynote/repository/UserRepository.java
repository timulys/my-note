package my.timulys.mynote.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import my.timulys.mynote.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	// JPA Repository Methods
}
