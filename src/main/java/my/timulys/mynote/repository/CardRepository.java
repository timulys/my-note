package my.timulys.mynote.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import my.timulys.mynote.domain.Card;

public interface CardRepository extends JpaRepository<Card, Long> {
	// JPA Repository Methods
}
