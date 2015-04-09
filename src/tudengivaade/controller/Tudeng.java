package tudengivaade.controller;

public class Tudeng {
	private String eesnimi;
	private String perenimi;
	private int oppeAasta;
	
	
	public Tudeng(String eesnimi, String perenimi, int oppeAasta) {
		super();
		this.eesnimi = eesnimi;
		this.perenimi = perenimi;
		this.oppeAasta = oppeAasta;
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
}
