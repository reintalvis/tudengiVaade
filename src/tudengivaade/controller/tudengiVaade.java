package tudengivaade.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.websocket.Session;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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

		List<Tudeng> tudengid = new ArrayList<Tudeng>();
		tudengid.add(new Tudeng(1, "Ees", "Pere", "102112IAPP", 2));
		tudengid.add(new Tudeng(1, "Veel", "Yks", "101021IAPM", 3));
		mav.addObject("tudengid", tudengid);

		mav.addObject("oppetaseNimi", oppetaseNimi);
		mav.addObject("oppeaasta", oppeaasta);
		return mav;
	}

	@RequestMapping("/oppejoud_koormustega")
	public @ResponseBody ModelAndView oppejoudKoormustega(Integer oppejou_id) {
		ModelAndView mav = new ModelAndView("oppejoud_koormustega");
		Initialize initialize = Initialize.getInstance();

		List<Oppejoud> opetajad = initialize.getOpetajad();
		List<LoputooTeema> teemad = initialize.getTeemad();

		int[] koormused = new int[opetajad.size()];
		for (int i = 0; i < koormused.length; i++) {
			koormused[i] = 0;
		}
		System.out.println(teemad.size());
		System.out.println(opetajad.size());
		for (int i = 0; i < opetajad.size(); i++) {
			for (int j = 0; j < teemad.size(); j++) {
				if (teemad.get(j).getTudeng() != null
						&& teemad.get(j).getJuhendaja() == opetajad.get(i)) {
					koormused[i] += 1;
				}
			}
		}

		// InitOppejoud initializeOpetajad = new InitOppejoud();
		// opetajad = initializeOpetajad.init();

		mav.addObject("opetajad", opetajad);
		mav.addObject("koormused", koormused);

		return mav;
	}

}
