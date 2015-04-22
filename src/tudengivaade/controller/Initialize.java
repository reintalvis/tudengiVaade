package tudengivaade.controller;

import java.util.ArrayList;
import java.util.List;

public class Initialize {
	private List<Oppejoud> opetajad = new ArrayList <Oppejoud>();
	private List<LoputooTeema> teemad = new ArrayList<LoputooTeema>();
	private List<Tudeng> tudengid = new ArrayList<Tudeng>();


	private static Initialize instance = null;
	protected Initialize() {
		// Exists only to defeat instantiation.
	}
	public static Initialize getInstance() {
		if(instance == null) {
			instance = new Initialize();
			instance.initOpetajad();
			instance.initTudengid();
			instance.initTeemad();
		}
		return instance;
	}


	private void initOpetajad() {
		this.opetajad.add(new Oppejoud(1, "Rauno", "Kulla", "Boss", "Tehnoloogia", "Tallinn, Tehnika 33", "20", "53451569", "raunokulla@hotmail.com"));
		this.opetajad.add(new Oppejoud(2, "Oskar", "Liblik", "Sekretär", "Tehnoloogia", "Tallinn, Tehnika 33", "20", "53451569", "raunokulla@hotmail.com"));
		this.opetajad.add(new Oppejoud(3, "Ando", "Paju", "Rektor", "Tehnoloogia", "Tallinn, Tehnika 33", "20", "53451569", "raunokulla@hotmail.com"));
		this.opetajad.add(new Oppejoud(4, "Rein", "Talvik", "Õppetooli hoidja", "Majandus", "Tallinn, Tehnika 33", "20", "53451569", "raunokulla@hotmail.com"));
		this.opetajad.add(new Oppejoud(5, "Rauno", "Pehka", "Doktorant", "Matemaatika", "Tallinn, Tehnika 33", "20", "53451569", "raunokulla@hotmail.com"));
		this.opetajad.add(new Oppejoud(6, "Ando", "Leement", "Lektor", "Füüsika", "Tallinn, Tehnika 33", "20", "53451569", "raunokulla@hotmail.com"));
		this.opetajad.add(new Oppejoud(7, "Gert", "Kulla", "Doktorant", "Logistika", "Tallinn, Tehnika 33", "20", "53451569", "raunokulla@hotmail.com"));
		this.opetajad.add(new Oppejoud(8, "Rein", "Talvis", "Professor", "Keeltekool", "Tallinn, Tehnika 33", "20", "53451569", "raunokulla@hotmail.com"));
		/*
		this.opetajad.add(new Oppejoud(9, "Rauno", "Kulla", "Boss", "Tehnoloogia", "Tallinn, Tehnika 33", "20", "53451569", "raunokulla@hotmail.com"));
		this.opetajad.add(new Oppejoud(10, "Rauno", "Kulla", "Boss", "Tehnoloogia", "Tallinn, Tehnika 33", "20", "53451569", "raunokulla@hotmail.com"));
		this.opetajad.add(new Oppejoud(11, "Rauno", "Kulla", "Boss", "Tehnoloogia", "Tallinn, Tehnika 33", "20", "53451569", "raunokulla@hotmail.com"));
		this.opetajad.add(new Oppejoud(12, "Rauno", "Kulla", "Boss", "Tehnoloogia", "Tallinn, Tehnika 33", "20", "53451569", "raunokulla@hotmail.com"));
		this.opetajad.add(new Oppejoud(13, "Rauno", "Kulla", "Boss", "Tehnoloogia", "Tallinn, Tehnika 33", "20", "53451569", "raunokulla@hotmail.com"));
		this.opetajad.add(new Oppejoud(14, "Rauno", "Kulla", "Boss", "Tehnoloogia", "Tallinn, Tehnika 33", "20", "53451569", "raunokulla@hotmail.com"));
		this.opetajad.add(new Oppejoud(15, "Rauno", "Kulla", "Boss", "Tehnoloogia", "Tallinn, Tehnika 33", "20", "53451569", "raunokulla@hotmail.com"));
		this.opetajad.add(new Oppejoud(16, "Rauno", "Kulla", "Boss", "Tehnoloogia", "Tallinn, Tehnika 33", "20", "53451569", "raunokulla@hotmail.com"));
		this.opetajad.add(new Oppejoud(17, "Rauno", "Kulla", "Boss", "Tehnoloogia", "Tallinn, Tehnika 33", "20", "53451569", "raunokulla@hotmail.com"));
		this.opetajad.add(new Oppejoud(18, "Rauno", "Kulla", "Boss", "Tehnoloogia", "Tallinn, Tehnika 33", "20", "53451569", "raunokulla@hotmail.com"));
		this.opetajad.add(new Oppejoud(19, "Rauno", "Kulla", "Boss", "Tehnoloogia", "Tallinn, Tehnika 33", "20", "53451569", "raunokulla@hotmail.com"));
		this.opetajad.add(new Oppejoud(20, "Rauno", "Kulla", "Boss", "Tehnoloogia", "Tallinn, Tehnika 33", "20", "53451569", "raunokulla@hotmail.com"));
		this.opetajad.add(new Oppejoud(21, "Rauno", "Kulla", "Boss", "Tehnoloogia", "Tallinn, Tehnika 33", "20", "53451569", "raunokulla@hotmail.com"));
		this.opetajad.add(new Oppejoud(22, "Rauno", "Kulla", "Boss", "Tehnoloogia", "Tallinn, Tehnika 33", "20", "53451569", "raunokulla@hotmail.com"));
		this. */
	}

	private void initTudengid(){
		this.tudengid.add(new Tudeng(1, "Mari", "Maasikas", "143686IAPM",1));
		this.tudengid.add(new Tudeng(2, "Jaan", "Tamm", "113686IABM",2));
		this.tudengid.add(new Tudeng(3, "Jüri", "Vaarikas", "121686IABB",1));
		this.tudengid.add(new Tudeng(4, "Taavi", "Kask", "112686IAPM",3));
		this.tudengid.add(new Tudeng(5, "Tarmo", "Sammal", "081686IABB",3));
		this.tudengid.add(new Tudeng(6, "Viktor", "Kukk", "0923231IAPM",3));
	}

	private void initTeemad(){
		this.teemad.add(new LoputooTeema(1, "esimene lõputöö teema", "First thesis", "", "Välja pakutud", false, this.opetajad.get(5), new Tudeng()));
		this.teemad.add(new LoputooTeema(2, "teine lõputöö teema", "Second thesis", "", "Kinnitatud", false, this.opetajad.get(1), this.tudengid.get(1)));
		this.teemad.add(new LoputooTeema(3, "kolmas lõputöö teema", "Third thesis", "", "Kinnitatud", false, this.opetajad.get(2),this.tudengid.get(2)));
		this.teemad.add(new LoputooTeema(4, "neljas lõputöö teema", "Fourth thsis", "", "Kinnitatud", false, this.opetajad.get(4), this.tudengid.get(3)));
		this.teemad.add(new LoputooTeema(5, "viies lõputöö teema", "Fifth thesis", "", "Välja pakutud", false, this.opetajad.get(1), new Tudeng()));
		this.teemad.add(new LoputooTeema(6, "kuues lõputöö teema", "Sixth thesis", "", "Välja pakutud", false, this.opetajad.get(5), new Tudeng()));
		this.teemad.add(new LoputooTeema(7, "seitsmes lõputöö teema", "Seventh thesis", "", "Välja pakutud", false, this.opetajad.get(4), new Tudeng()));
		this.teemad.add(new LoputooTeema(8, "kaheksas lõputöö teema", "Eight thesis", "", "Välja pakutud", false, this.opetajad.get(4), new Tudeng()));
		this.teemad.add(new LoputooTeema(9, "üheksas lõputöö teema", "9t thesis", "", "Tagasi lükatud", true, this.opetajad.get(3), this.tudengid.get(1)));
		this.teemad.add(new LoputooTeema(10, "kümnes lõputöö teema", "10th thesis", "", "Tagasi lükatud", true, this.opetajad.get(2), this.tudengid.get(2)));
		this.teemad.add(new LoputooTeema(11, "üheteistkümnes lõputöö teema", "11th thesis", "", "Välja pakutud",false,  this.opetajad.get(3), new Tudeng()));
		this.teemad.add(new LoputooTeema(12, "12. lõputöö teema", "12th thesis", "",  "Broneeritud",false,  this.opetajad.get(3), this.tudengid.get(4)));
		this.teemad.add(new LoputooTeema(13, "13. lõputöö teema", "13th thesis", "", "Broneeritud", false, this.opetajad.get(3), this.tudengid.get(5)));
		this.teemad.add(new LoputooTeema(14, "14. lõputöö teema", "14th thesis", "", "Broneeritud", false, this.opetajad.get(3), this.tudengid.get(0)));
		this.teemad.add(new LoputooTeema(15, "15. lõputöö teema", "15th thesis", "", "Välja pakutud", true,  this.opetajad.get(2), new Tudeng()));
		this.teemad.add(new LoputooTeema(16, "16. lõputöö teema", "16th thesis", "", "Välja pakutud", true, this.opetajad.get(2), new Tudeng()));
		this.teemad.add(new LoputooTeema(17, "17. lõputöö teema", "17th thesis", "", "Välja pakutud", true, this.opetajad.get(2), new Tudeng()));
		this.teemad.add(new LoputooTeema(18, "18. lõputöö teema", "18th thesis", "", "Välja pakutud", true, this.opetajad.get(1), new Tudeng()));
	}

	public List<Oppejoud> getOpetajad() {
		return opetajad;
	}

	public List<LoputooTeema> getTeemad() {
		return teemad;
	}

	public List<Tudeng> getTudengid() {
		return tudengid;
	}


}
