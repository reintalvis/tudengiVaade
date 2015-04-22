package tudengivaade.controller;

import java.util.ArrayList;
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
public class LoputooTeemaLisamiseController {

	private Initialize initialize = Initialize.getInstance();
	

	private List<Tudeng> tudengid = initialize.getTudengid();
	private List<Oppejoud> opetajad = initialize.getOpetajad();
	private List<LoputooTeema> minuTeemad = initialize.getTeemad();
	
	private Logger logger = Logger.getLogger(LoputooTeemaLisamiseController.class);

	@RequestMapping(value="/lisa_loputoo_teema.jsp")
	public @ResponseBody ModelAndView showForm(String id){
		Oppejoud oppejoud = initialize.getOppejoud(id);
		ModelAndView mav = new ModelAndView("lisa_loputoo_teema");

		mav.addObject("oppejoud", oppejoud);
		return mav;
	}
	
	@RequestMapping(value="/loputoo_teema_otsing.jsp",method=RequestMethod.GET)
	public String showSearchForm(){

		return "loputoo_teema_otsing";
	}

	@RequestMapping(value="/loputoo_teemade_nimekiri_oppejou_vaatest.jsp",method=RequestMethod.GET)
	public @ResponseBody ModelAndView getThesisSubjectsByTeacher(String id){
		List<LoputooTeema> sobivadTeemad = initialize.getOppejouTeemad(id);
		ModelAndView mav = new ModelAndView("loputoo_teemade_nimekiri_oppejou_vaatest");

		mav.addObject("teemad", sobivadTeemad);
		return mav;
	}

	@RequestMapping(value="/loputoo_teema_otsing.jsp",method=RequestMethod.POST)
	public @ResponseBody ModelAndView getThesisSubjectsByName(String nimetus_est, String nimetus_eng, String oppejoud_eesnimi, String oppejoud_perenimi){
		List<LoputooTeema> sobivadTeemad = new ArrayList<LoputooTeema>();
		
		for(LoputooTeema loputeema : minuTeemad){
			if (nimetus_est != null && nimetus_est != "" && loputeema.getNimetus_est().toLowerCase().contains(nimetus_est.toLowerCase()) ||
					nimetus_eng != null && nimetus_eng != "" && loputeema.getNimetus_eng().toLowerCase().contains(nimetus_eng.toLowerCase()) ||
							oppejoud_eesnimi != null && oppejoud_eesnimi != "" && loputeema.getJuhendaja().getEesnimi().toLowerCase().contains(oppejoud_eesnimi.toLowerCase()) ||
							oppejoud_perenimi != null && oppejoud_perenimi != "" && loputeema.getJuhendaja().getPerenimi().toLowerCase().contains(oppejoud_perenimi.toLowerCase())){
				sobivadTeemad.add(loputeema);
			}
		}
		ModelAndView mav = new ModelAndView("loputoo_teemade_nimekiri_teemade_otsingu_vaatest");

		mav.addObject("teemad", sobivadTeemad);
		return mav;
	}
	@RequestMapping(value="/loputoo_teemade_nimekiri_oppejou_vaatest.jsp",method=RequestMethod.POST)
	public @ResponseBody ModelAndView AddThesisSubject(String juhendaja_id, String tudeng_id, String nimetus_est, String nimetus_eng, String kirjeldus){

		Oppejoud oppejoud = null;
		Tudeng tudeng = null;
		int count;
		try {
			count = minuTeemad.size();
		} catch (NullPointerException e) {
			count = 0;
		}
		for(Oppejoud oj : opetajad){
			if (oj.getOppejoud_id() == Integer.parseInt(juhendaja_id)){
				oppejoud = oj;
				break;
			}
		}
		for(Tudeng tud : tudengid){
			if (tud.getTudeng_id() == Integer.parseInt(tudeng_id)){
				tudeng = tud;
				break;
			}
		}
		
		LoputooTeema teema = new LoputooTeema(count, nimetus_est, nimetus_eng, kirjeldus, "Välja pakutud", true, oppejoud, tudeng);

		minuTeemad.add(teema);
		return getThesisSubjectsByTeacher(juhendaja_id);

	}




}