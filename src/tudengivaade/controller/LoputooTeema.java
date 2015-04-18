package tudengivaade.controller;

public class LoputooTeema {

	private int loputooTeema_id;
	private String nimetus_est;
	private String nimetus_eng;

	private String midagi_veel;
	private Oppejoud juhendaja;
	private Tudeng tudeng;

	public LoputooTeema(int loputooTeema_id, String nimetus_est,
			String nimetus_eng, String midagi_veel, Oppejoud juhendaja, Tudeng tudeng) {
		super();
		this.loputooTeema_id = loputooTeema_id;
		this.nimetus_est = nimetus_est;
		this.nimetus_eng = nimetus_eng;
		this.midagi_veel = midagi_veel;
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

	public String getMidagi_veel() {
		return midagi_veel;
	}

	public void setMidagi_veel(String midagi_veel) {
		this.midagi_veel = midagi_veel;
	}

	public Oppejoud getJuhendaja() {
		return juhendaja;
	}

	public void setJuhendaja(Oppejoud juhendaja) {
		this.juhendaja = juhendaja;
	}







}
