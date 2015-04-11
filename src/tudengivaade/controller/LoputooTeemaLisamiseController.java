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

	private List<LoputooTeema> minuTeemad = new ArrayList<LoputooTeema>();
	private Logger logger = Logger.getLogger(LoputooTeemaLisamiseController.class);
	
    @RequestMapping(value="/lisa_loputoo_teema.jsp")
    public String showForm(){
        return "lisa_loputoo_teema";
    }

    @RequestMapping(value="/loputoo_teemade_nimekiri.jsp",method=RequestMethod.POST)
    public @ResponseBody ModelAndView AddThesisSubject(String nimetus_est, String nimetus_eng, String midagi_veel, String tudeng_eesnimi, String tudeng_perenimi){
    	logger.error("alustab!!");
    	int count;
		try {
			count = minuTeemad.size();
			//logger.error("siin!!");
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			count = 0;
			//logger.error("Vähemalt siia jõuab enne kui viga saab!");
		}
		/*logger.error(count);
		logger.error(nimetus_est);
		logger.error(nimetus_eng);
		logger.error(midagi_veel);
		logger.error(tudeng_eesnimi);
		logger.error(tudeng_perenimi);
		*/
		
    	//staatiliselt on sees, et õpilane on 1 aasta õpilane
		LoputooTeema teema = new LoputooTeema(count, nimetus_est, nimetus_eng, midagi_veel, new Oppejoud(), new Tudeng(tudeng_eesnimi, tudeng_perenimi, 1));
    	//logger.error(teema);
    	minuTeemad.add(teema);

		ModelAndView mav = new ModelAndView("loputoo_teemade_nimekiri");
		
		mav.addObject("teemad", minuTeemad);
		return mav;
    }



    
}