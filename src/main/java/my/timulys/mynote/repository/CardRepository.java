package my.timulys.mynote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import my.timulys.mynote.domain.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
	// JPA Repository Methods
//	List<Card> findCardByUserId(String userId);
}
