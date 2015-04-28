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
public class avatudTeemaController {

	private List<avatudTeema> minuTeemad = new ArrayList<avatudTeema>();
	private Logger logger = Logger.getLogger(avatudTeemaController.class);

	@RequestMapping(value="/avatud_teema.jsp")
	public String showForm(){
		return "avatud_teema";
	}

	@RequestMapping(value="/avatud_teema.jsp",method=RequestMethod.GET)
	public @ResponseBody ModelAndView getThesisSubjects(){

		ModelAndView mav = new ModelAndView("avatud_teema");

		mav.addObject("teemad", minuTeemad);
		return mav;
	}
	@RequestMapping(value="/avatud_teema.jsp",method=RequestMethod.POST)
	public @ResponseBody ModelAndView AddThesisSubject(String postituse_sisu){

		avatudTeema teema = new avatudTeema(postituse_sisu);

		minuTeemad.add(teema);

		ModelAndView mav = new ModelAndView("avatud_teema");

		mav.addObject("teemad", minuTeemad);
		return mav;
	}

}