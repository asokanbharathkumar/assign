package rest.A2;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping("/rest/user")
	public ModelAndView userform() {
		return new ModelAndView("A2/UserForm");
	}
	@ResponseBody
	@RequestMapping("/rest/validateUser")
	public String validate(@RequestParam Map<String, String> req) {
		if(req.get("username").compareTo("bharath")==0 && req.get("bharath").compareTo("asdfg")==0)
			return "Not a valid User";
		return "Not a valid User";
	}
}
