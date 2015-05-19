package tudengivaade.controller;

import java.util.ArrayList;
import java.util.Date;
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

/**
 * Lõputöö teema andmete kontroller.
 * @author Admin
 *
 */
@Controller
public class LoputooTeemaLisamiseController {

	private Initialize initialize = Initialize.getInstance();
	

	private List<Tudeng> tudengid = initialize.getTudengid();
	private List<Oppejoud> opetajad = initialize.getOpetajad();
	private List<LoputooTeema> minuTeemad = initialize.getTeemad();
	
	private Logger logger = Logger.getLogger(LoputooTeemaLisamiseController.class);
	/**
	 * Uue lõputöö teema lisamise vaate suunamine. Sisendina märgitakse õppejõu, kellele teemat pakutakse, id.
	 * 
	 * @param id
	 * @return mav
	 */
	@RequestMapping(value="/lisa_loputoo_teema.jsp")
	public @ResponseBody ModelAndView showForm(String id){
		Oppejoud oppejoud = initialize.getOppejoud(id);
		ModelAndView mav = new ModelAndView("lisa_loputoo_teema");

		mav.addObject("oppejoud", oppejoud);
		return mav;
	}
	/**
	 * Lõputöö teema otsingu vaate suunamine.
	 * @return
	 */
	@RequestMapping(value="/loputoo_teema_otsing.jsp",method=RequestMethod.GET)
	public String showSearchForm(){

		return "loputoo_teema_otsing";
	}

	/**
	 * Kindla õppejõuga seotud teemade vaate suunamin. Sisendina märgitakse õppejõu, kelle teemasid soovitakse vaadata, id.
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/loputoo_teemade_nimekiri_oppejou_vaatest.jsp",method=RequestMethod.GET)
	public @ResponseBody ModelAndView getThesisSubjectsByTeacher(String id){
		List<LoputooTeema> sobivadTeemad = initialize.getOppejouTeemad(id);
		ModelAndView mav = new ModelAndView("loputoo_teemade_nimekiri_oppejou_vaatest");

		mav.addObject("teemad", sobivadTeemad);
		return mav;
	}
	/**
	 * Lõputöö teema otsingu tulemuste vaate suunamine. Sisendina märgitakse kasutaja sisestatud andmed.
	 * @param nimetus_est
	 * @param nimetus_eng
	 * @param oppejoud_eesnimi
	 * @param oppejoud_perenimi
	 * @return
	 */

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
	/**
	 * Õpilase poolt õppejõule teema välja pakkumine. Teostatakse teema lisamine õppejõule.
	 * @param juhendaja_id
	 * @param tudeng_id
	 * @param nimetus_est
	 * @param nimetus_eng
	 * @param kirjeldus
	 * @return
	 */
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
	/**
	 * Suunab konkreetse lõputöö teema andmete vaatesse. Sisendiks märgitud lõputöö teema, mille andmeid kuvatakse, id
	 * @param Loputoo_id
	 * @return
	 */
	@RequestMapping(value = "/teema_andmed.jsp", method = RequestMethod.GET)
	public @ResponseBody ModelAndView getThesisSubjects(Integer Loputoo_id) {
		LoputooTeema teema = null;
		for (LoputooTeema loputooTeema : minuTeemad) {
			if (loputooTeema.getLoputooTeema_id() == Loputoo_id) {
				teema = loputooTeema;
			}
		}
		ModelAndView mav = new ModelAndView("teema_andmed");

		mav.addObject("teema", teema);
		return mav;
	}

	/**
	 * Post meetod, mis käsitleb tudengi poolt lõputöö teemale kandideerimise funktsionaalsust.
	 * @param Loputoo_id
	 * @param nimetus_est
	 * @param nimetus_eng
	 * @param kirjeldus
	 * @param staatus
	 * @param olek
	 * @param juhendaja
	 * @param tudeng
	 * @param postitus
	 * @return
	 */
	@RequestMapping(value = "/teema_andmed.jsp", method = RequestMethod.POST)
	public @ResponseBody ModelAndView AddThesisSubject(Integer Loputoo_id,
			String nimetus_est, String nimetus_eng, String kirjeldus,
			String staatus, Boolean olek, Oppejoud juhendaja, Tudeng tudeng,
			String postitus) {
		LoputooTeema teema = null;
		for (LoputooTeema loputooTeema : minuTeemad) {
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
	
	/**
	 * Lõputöö teemale kommentaari lisamise funktsionaaluse teostamine. Sisendina märgitakse lõputöö, mida kommenteeritakse, id ning kommenteeritav tekst (postitus)
	 * ja tudeng, kes kommenteerib. Suunatakse tagasi lõputöö andmete vaatesse, kuhu on lisatud kommentaar.
	 * @param Loputoo_id
	 * @param postitus
	 * @param tudeng_id
	 * @return
	 */
	@RequestMapping(value = "/lisa_kommentaar.jsp", method = RequestMethod.POST)
	public @ResponseBody ModelAndView AddComment(Integer Loputoo_id, String postitus, Integer tudeng_id) {
		LoputooTeema teema = null;
		Tudeng tudeng = null;
		
		
		for (LoputooTeema loputooTeema : minuTeemad) {
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