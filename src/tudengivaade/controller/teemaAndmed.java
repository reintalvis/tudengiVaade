package tudengivaade.controller;

public class teemaAndmed {

	private String postitus;
	private int loputooTeema_id;
	private String nimetus_est;
	private String nimetus_eng;
	private String staatus;
	private Tudeng tudeng;
	
	public teemaAndmed (String postitus) {
		super();
		this.postitus = postitus;
		this.loputooTeema_id = loputooTeema_id;
		this.nimetus_est = nimetus_est;
		this.nimetus_eng = nimetus_eng;
		this.staatus=staatus;
		this.tudeng=tudeng;
	}
	
	public String getPostitus() {
		return postitus;
	}

	public void setPostituse_sisu(String postitus) {
		this.postitus = postitus;
	}
	
	public int getLoputooTeema_id() {
		return loputooTeema_id;
	}
	
	public void setLoputooTeema_id(int loputooTeema_id) {
		this.loputooTeema_id = loputooTeema_id;
	}

	public Tudeng getTudeng() {
		return tudeng;
	}

	public void setTudeng(Tudeng tudeng) {
		this.tudeng = tudeng;
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

	public String getStaatus() {
		return staatus;
	}

	public void setStaatus(String staatus) {
		this.staatus = staatus;
	}
	
}
