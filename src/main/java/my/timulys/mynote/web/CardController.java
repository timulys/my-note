package my.timulys.mynote.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import my.timulys.mynote.service.CardService;

@Controller
@RequestMapping("/cards")
public class CardController {
	@Autowired
	private CardService cardService;
	
	@RequestMapping(value="/index")
	public String home(Model model) {
		model.addAttribute("cards", cardService.findAllCard());
		return "index";
	}
}
