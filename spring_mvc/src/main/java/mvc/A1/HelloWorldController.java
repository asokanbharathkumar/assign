package mvc.A1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@RequestMapping(value= "/Greeting")
	public ModelAndView helloWorld() {
		ModelAndView mav= new ModelAndView("A1/Hello");
		mav.addObject("msg", "Hello World");
		return mav;
	}

}
