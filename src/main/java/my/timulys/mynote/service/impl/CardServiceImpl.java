package my.timulys.mynote.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.timulys.mynote.domain.Card;
import my.timulys.mynote.domain.User;
import my.timulys.mynote.repository.CardRepository;
import my.timulys.mynote.service.CardService;

@Service
public class CardServiceImpl implements CardService {
	//
	@Autowired
	private CardRepository cardRepository;

	@Override
	public List<Card> findCardByUser(User user) {
//		List<Card> cardList = cardRepository.findCardByUserId(user.getUserId());
		return null;
	}
	
	@Override
	public List<Card> findAllCard() {
		List<Card> cardList = cardRepository.findAll();
		return cardList;
	}

	@Override
	public Card findCardById(Long id) {
		Card card = cardRepository.findById(id).get();
		return card;
	}

	@Override
	public void updateCard(Card card) {
		cardRepository.save(card);
	}

	@Override
	public void deleteCard(Long id) {
		Card card = cardRepository.getOne(id);
		if (card != null) {
			cardRepository.delete(card);
		}
	}
	
}
