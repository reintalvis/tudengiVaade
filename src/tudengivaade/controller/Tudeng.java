package tudengivaade.controller;

public class Tudeng {
	
	private int tudeng_id;
	private String eesnimi;
	private String perenimi;
	private String matrikkel;
	private String oppetase;
	private int oppeAasta;
	
	
	public Tudeng(int tudeng_id, String eesnimi, String perenimi, String matrikkel, int oppeAasta, String oppetase) {
		super();
		this.tudeng_id = tudeng_id;
		this.eesnimi = eesnimi;
		this.perenimi = perenimi;
		this.matrikkel = matrikkel;
		this.oppeAasta = oppeAasta;
		this.setOppetase(oppetase);
	}
	
	public Tudeng() {
		// TODO Auto-generated constructor stub
	}

	public int getTudeng_id() {
		return tudeng_id;
	}

	public void setTudeng_id(int tudeng_id) {
		this.tudeng_id = tudeng_id;
	}
	public String getEesnimi() {
		return eesnimi;
	}
	public void setEesnimi(String eesnimi) {
		this.eesnimi = eesnimi;
	}
	public String getPerenimi() {
		return perenimi;
	}
	public void setPerenimi(String perenimi) {
		this.perenimi = perenimi;
	}
	public int getOppeAasta() {
		return oppeAasta;
	}
	public void setOppeAasta(int oppeAasta) {
		this.oppeAasta = oppeAasta;
	}
	public String getMatrikkel() {
		return matrikkel;
	}

	public void setMatrikkel(String matrikkel) {
		this.matrikkel = matrikkel;
	}

	public String getOppetase() {
		return oppetase;
	}

	public void setOppetase(String oppetase) {
		this.oppetase = oppetase;
	}
}
