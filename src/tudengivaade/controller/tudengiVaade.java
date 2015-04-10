package tudengivaade.controller;
 
import java.util.ArrayList;
import java.util.List;

import javax.websocket.Session;

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
	
	@RequestMapping("/loputood_valimata")
	public ModelAndView loputood_valimata() {
		ModelAndView mav = new ModelAndView("loputood_valimata");
		
		List<Tudeng> tudengid = new ArrayList<Tudeng>();
		tudengid.add(new Tudeng("Ees", "Pere", 2));
		tudengid.add(new Tudeng("Veel", "Yks", 3));
		mav.addObject("tudengid", tudengid );
		return mav;
	}
}