package tudengivaade.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
 
@Controller
public class tudengiVaade {

	@RequestMapping("/kuulutus")
	public ModelAndView kuulutus() {

		return new ModelAndView("kuulutus");
	}
	
	@RequestMapping("/minukandideerimised")
	public ModelAndView minukandideerimised() {
 
		return new ModelAndView("minukandideerimised");
	}

	@RequestMapping("/tulemused")
	public ModelAndView tulemused() {

		return new ModelAndView("tulemused");
	}
}