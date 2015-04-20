package tudengivaade.controller;

public class LoputooTeema {

	private int loputooTeema_id;
	private String nimetus_est;
	private String nimetus_eng;
	private String kirjeldus;


	private String staatus;
	private boolean opilase_teema;

	private Oppejoud juhendaja;
	private Tudeng tudeng;

	public LoputooTeema(int loputooTeema_id, String nimetus_est,
			String nimetus_eng, String kirjeldus, String staatus, boolean opilase_teema, Oppejoud juhendaja, Tudeng tudeng) {
		super();
		this.loputooTeema_id = loputooTeema_id;
		this.nimetus_est = nimetus_est;
		this.nimetus_eng = nimetus_eng;
		this.kirjeldus = kirjeldus;
		this.staatus = staatus;
		this.opilase_teema = opilase_teema;
		this.juhendaja = juhendaja;
		this.tudeng = tudeng;
	}

	public int getLoputooTeema_id() {
		return loputooTeema_id;
	}

	public Tudeng getTudeng() {
		return tudeng;
	}

	public void setTudeng(Tudeng tudeng) {
		this.tudeng = tudeng;
	}

	public void setLoputooTeema_id(int loputooTeema_id) {
		this.loputooTeema_id = loputooTeema_id;
	}

	public String getNimetus_est() {
		return nimetus_est;
	}

	public void setNimetus_est(String nimetus_est) {
		this.nimetus_est = nimetus_est;
	}

	public String getNimetus_eng() {
		return nimetus_eng;
	}

	public void setNimetus_eng(String nimetus_eng) {
		this.nimetus_eng = nimetus_eng;
	}
	public String getKirjeldus() {
		return kirjeldus;
	}

	public void setKirjeldus(String kirjeldus) {
		this.kirjeldus = kirjeldus;
	}

	public String getStaatus() {
		return staatus;
	}

	public void setStaatus(String staatus) {
		this.staatus = staatus;
	}

	public boolean isOpilase_teema() {
		return opilase_teema;
	}

	public void setOpilase_teema(boolean opilase_teema) {
		this.opilase_teema = opilase_teema;
	}

	public Oppejoud getJuhendaja() {
		return juhendaja;
	}

	public void setJuhendaja(Oppejoud juhendaja) {
		this.juhendaja = juhendaja;
	}







}
