package my.timulys.mynote.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import my.timulys.mynote.repository.CardRepository;
import my.timulys.mynote.service.CardService;

public class CardServiceImpl implements CardService {
	//
	@Autowired
	private CardRepository cardRepository;
	
	
}
