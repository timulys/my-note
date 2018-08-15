package my.timulys.mynote.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.timulys.mynote.service.CardService;

@RestController
@RequestMapping("/cards")
public class CardController {
	@Autowired
	private CardService cardService;
	
	@GetMapping("")
	public String home(Model model) {
		model.addAttribute("cards", cardService.findAllCard());
		return "index.html";
	}
}
