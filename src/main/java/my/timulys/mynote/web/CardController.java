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
	
	@RequestMapping(value = "/index")
	public String index(Model model) {
		model.addAttribute("message", "Hello, World!!!");
		return "index";
	}
	
	@RequestMapping(value = "/welcome")
	public String welcome(Model model) {
		model.addAttribute("welcome", "Welcome to My Daily Todo Notes");
		return "welcome";
	}
}
