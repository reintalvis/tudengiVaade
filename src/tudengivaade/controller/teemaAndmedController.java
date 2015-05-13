package tudengivaade.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class teemaAndmedController {

	private teemaAndmed minuTeema;
	private Initialize initialize = Initialize.getInstance();
	private Logger logger = Logger.getLogger(teemaAndmedController.class);

	@RequestMapping(value = "/teema_andmed.jsp")
	public String showForm() {
		return "teema_andmed";
	}

	@RequestMapping(value = "/teema_andmed.jsp", method = RequestMethod.GET)
	public @ResponseBody ModelAndView getThesisSubjects(Integer Loputoo_id) {
		LoputooTeema teema = null;
		List<LoputooTeema> teemad = initialize.getTeemad();
		for (LoputooTeema loputooTeema : teemad) {
			if (loputooTeema.getLoputooTeema_id() == Loputoo_id) {
				teema = loputooTeema;
			}
		}
		ModelAndView mav = new ModelAndView("teema_andmed");

		mav.addObject("teema", teema);
		return mav;
	}

	@RequestMapping(value = "/teema_andmed.jsp", method = RequestMethod.POST)
	public @ResponseBody ModelAndView AddThesisSubject(Integer Loputoo_id,
			String nimetus_est, String nimetus_eng, String kirjeldus,
			String staatus, Boolean olek, Oppejoud juhendaja, Tudeng tudeng,
			String postitus) {
		LoputooTeema teema = null;
		List<LoputooTeema> teemad = initialize.getTeemad();
		for (LoputooTeema loputooTeema : teemad) {
			if (loputooTeema.getLoputooTeema_id() == Loputoo_id) {
				teema = loputooTeema;
			}
		}
		if(teema != null && teema.getStaatus().equals("Välja pakutud")){
			teema.setTudeng(new Tudeng(226,"Kandideerija", "Perenimi", "1234IAPM",3,"B"));
			teema.setStaatus("Broneeritud");
			

			ModelAndView mav = new ModelAndView("kandideerimise_tulemus");

			mav.addObject("teema", teema);
			return mav;
		}


		ModelAndView mav = new ModelAndView("teema_andmed");

		mav.addObject("teema", teema);
		return mav;

	}
	
	@SuppressWarnings("null")
	@RequestMapping(value = "/lisa_kommentaar.jsp", method = RequestMethod.POST)
	public @ResponseBody ModelAndView AddComment(Integer Loputoo_id, String postitus, Integer tudeng_id) {
		LoputooTeema teema = null;
		Tudeng tudeng = null;
		
		List<LoputooTeema> teemad = initialize.getTeemad();
		List<Tudeng> tudengid = initialize.getTudengid();
		
		for (LoputooTeema loputooTeema : teemad) {
			if (loputooTeema.getLoputooTeema_id() == Loputoo_id) {
				teema = loputooTeema;
				break;
			}
		}
		
		for (Tudeng tud : tudengid){
			if( tud.getTudeng_id() == tudeng_id ){
				tudeng = tud;
				break;
			}
		}
		
		
		teema.getKommentaar().add(new TeemaKommentaar(1, postitus, new Oppejoud(), tudeng, new Date()));
		
		
		


		ModelAndView mav = new ModelAndView("teema_andmed");

		mav.addObject("teema", teema);
		return mav;

	}

}
