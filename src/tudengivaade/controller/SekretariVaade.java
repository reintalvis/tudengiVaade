package tudengivaade.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SekretariVaade {

	private Initialize initialize = Initialize.getInstance();

	@RequestMapping("/sekretar_index")
	public ModelAndView sekretariIndex() {

		return new ModelAndView("sekretar_index");
	}
	

	@RequestMapping("/loputood_valimata")
	public @ResponseBody ModelAndView loputood_valimata(String oppetase,
			Integer oppeaasta) {
		ModelAndView mav = new ModelAndView("loputood_valimata");
		String oppetaseNimi = null;
		if (oppetase == null) {
			oppetase = "";
		}

		if (oppetase.equals("B")) {
			oppetaseNimi = "Bakalaureus";
		} else if (oppetase.equals("M")) {
			oppetaseNimi = "Magistriõpe";
		} else if (oppetase.equals("D")) {
			oppetaseNimi = "Doktoriõpe";
		} else {
			oppetaseNimi = "";
		}
		// TODO õppeaasta valideerimine


		Initialize initialize = Initialize.getInstance();
		List<Tudeng> filtreeritudTudengid = initialize.filtreeri_tudengid(oppetase,
				oppeaasta);

		mav.addObject("tudengid", filtreeritudTudengid);

		mav.addObject("oppetaseNimi", oppetaseNimi);
		mav.addObject("oppeaasta", oppeaasta);
		return mav;
	}

	@RequestMapping("/oppejoud_koormustega")
	public @ResponseBody ModelAndView oppejoudKoormustega(Integer oppejou_id) {
		ModelAndView mav = new ModelAndView("oppejoud_koormustega");

		List<Oppejoud> opetajad = initialize.getOpetajad();
		List<LoputooTeema> teemad = initialize.getTeemad();

		int[] koormused = new int[opetajad.size()];
		for (int i = 0; i < koormused.length; i++) {
			koormused[i] = 0;
		}
		
		for (int i = 0; i < opetajad.size(); i++) {
			for (int j = 0; j < teemad.size(); j++) {
				if (teemad.get(j).getTudeng() != null
						&& teemad.get(j).getJuhendaja() == opetajad.get(i)) {
					koormused[i] += 1;
				}
			}
		}

		mav.addObject("opetajad", opetajad);
		mav.addObject("koormused", koormused);

		return mav;
	}

}
