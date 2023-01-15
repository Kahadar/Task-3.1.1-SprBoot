package Task731.SpringBoot.SprBoot.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class IndexController {

	@RequestMapping("/")
	public String redirectToUsers() {
		String redirectTo = "/users";

		return "redirect:" + redirectTo;
	}
}