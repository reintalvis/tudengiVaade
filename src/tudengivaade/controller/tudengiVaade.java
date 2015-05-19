package tudengivaade.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
/**
 * Tudengivaate spetsiifiline kontroller.
 * teostab mitmeid tudengi jaoks vajalikke toiminguid
 * @author Admin
 *
 */
@Controller
public class tudengiVaade {

	private Initialize initialize = Initialize.getInstance();
	



	/**
	 * Teostab tudengi andmete kuvamise vaate suunamist
	 * @return ModelAndView - täidetud tudengi andmetega
	 */
	@RequestMapping("/minu_andmed")
	public ModelAndView minu_andmed() {
		ModelAndView mav = new ModelAndView("minu_andmed");
		mav.addObject("eesnimi", initialize.getEesnimi());
		mav.addObject("perenimi", initialize.getPerenimi());
		mav.addObject("oppeaasta", initialize.getOppeaasta());
		mav.addObject("roll", initialize.getRoll());
		
		return mav;
	}
	
	/**
	 * Rolli vahetust teostav meetod. Vahetab kasutaja rolli tudengist sekretäriks ja vastupidi.
	 * @return
	 */
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
