package my.timulys.mynote.service;

import java.util.List;

import my.timulys.mynote.domain.Card;
import my.timulys.mynote.domain.User;

public interface CardService {
	/**
	 * User별 Card 전체 목록
	 * 
	 * @param user
	 * @return List<Card>
	 */
	List<Card> findCardByUser(User user);
	/**
	 * Card 전체 목록 (로그인 기능 구현 전까지 사용)
	 * 
	 * @return List<Card>
	 */
	List<Card> findAllCard();
	/**
	 * Card 단건 조회
	 * 
	 * @param id - Long
	 * @return Card
	 */
	Card findCardById(Long id);
	/**
	 * Update Card
	 * 
	 * @param card
	 */
	void updateCard(Card card);
	/**
	 * Delete Card
	 * 
	 * @param id
	 */
	void deleteCard(Long id);
}
