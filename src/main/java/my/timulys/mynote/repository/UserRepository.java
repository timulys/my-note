package my.timulys.mynote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import my.timulys.mynote.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	// JPA Repository Methods
}
