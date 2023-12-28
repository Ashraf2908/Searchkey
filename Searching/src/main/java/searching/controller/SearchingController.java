package searching.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchingController {
	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("uinput") String input) {
		
		String url = "https://www.google.com/search?q="+input;
		RedirectView view = new RedirectView();
		view.setUrl(url);

		return view;
	}

}
