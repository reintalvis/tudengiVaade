package tudengivaade.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class OppejouOtsingController {
	private Initialize initialize = Initialize.getInstance();
	private List<Oppejoud> opetajad = initialize.getOpetajad();

    @RequestMapping(value="/oppejou_otsing.jsp",method=RequestMethod.GET)
    public String showForm(){
        return "oppejou_otsing";
    }
    @RequestMapping(value="/oppejou_andmed.jsp",method=RequestMethod.GET)
    public @ResponseBody ModelAndView teachersData(String id){
    	Oppejoud opetaja = null;
    	for(Oppejoud opet : opetajad){
    		if(opet.getOppejoud_id() == Integer.parseInt(id)){
    			opetaja = opet;
    			break;
    		}
    	}
    	
    	ModelAndView mav = new ModelAndView("oppejou_andmed");
    	mav.addObject("opetaja", opetaja);
        return mav;
    }

    @RequestMapping(value="/oppejou_otsing.jsp",method=RequestMethod.POST)
    public @ResponseBody ModelAndView showTeachers(String eesnimi, String perenimi, String instituut){
        List<Oppejoud> sobivadOpetajad = new ArrayList<Oppejoud>();
        for (Oppejoud opetaja : opetajad){
        	if (eesnimi != null && opetaja.getEesnimi().equalsIgnoreCase(eesnimi) || perenimi != null && opetaja.getPerenimi().equalsIgnoreCase(perenimi) || instituut != null && opetaja.getInstituut().equalsIgnoreCase(instituut)){
        		sobivadOpetajad.add(opetaja);
        	}
        }
		ModelAndView mav = new ModelAndView("oppejou_tulemused");
		
		mav.addObject("opetajad", sobivadOpetajad);
		return mav;
    }


    @RequestMapping(value="/oppejou_tulemused.jsp")
    public String teacherResults(ModelMap model){
        return "oppejou_tulemused";
    }
    
}