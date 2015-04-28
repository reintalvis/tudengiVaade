package tudengivaade.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class tudengiVaade {

	private Initialize initialize = Initialize.getInstance();
	
	@RequestMapping(value="/kandideerimise_tulemus.jsp",method=RequestMethod.GET)
	public @ResponseBody ModelAndView getThesisSubjects(Integer Loputoo_id){
		LoputooTeema teema = null;
		List<LoputooTeema> teemad = initialize.getTeemad();
		for (LoputooTeema loputooTeema : teemad) {
			if(loputooTeema.getLoputooTeema_id() == Loputoo_id){
				teema = loputooTeema;
			}
		}
		ModelAndView mav = new ModelAndView("kandideerimise_tulemus");

		mav.addObject("teema", teema);
		return mav;
	}

	@RequestMapping("/minu_kandideerimised")
	public ModelAndView minu_kandideerimised() {

		return new ModelAndView("minu_kandideerimised");
	}
	
	@RequestMapping("/minu_andmed")
	public ModelAndView minu_andmed() {
		ModelAndView mav = new ModelAndView("minu_andmed");
		mav.addObject("eesnimi", initialize.getEesnimi());
		mav.addObject("perenimi", initialize.getPerenimi());
		mav.addObject("oppeaasta", initialize.getOppeaasta());
		mav.addObject("roll", initialize.getRoll());
		
		return mav;
	}
	
	@RequestMapping("/vaheta_roll")
	public @ResponseBody String vaheta_roll() {
	    String roll = initialize.getRoll();
		if(roll.equals("tudeng")){
			initialize.setRoll("sekretär");
		}
		else{
			initialize.setRoll("tudeng");
		}
		return initialize.getEesnimi() + " " + initialize.getPerenimi();
	}
}
