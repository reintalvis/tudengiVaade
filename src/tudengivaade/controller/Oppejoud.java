package tudengivaade.controller;

public class Oppejoud {
	
	private int oppejoud_id;
	private String eesnimi;
	private String perenimi;
	private String ametikoht;
	private String instituut;
	 
	private String aadress;
	private String ruum;
	private String telefon;
	private String email;
	
	
	public Oppejoud(int oppejoud_id, String eesnimi, String perenimi, String ametikoht,
			String instituut, String aadress, String ruum, String telefon,
			String email) {
		super();
		this.oppejoud_id = oppejoud_id;
		this.eesnimi = eesnimi;
		this.perenimi = perenimi;
		this.ametikoht = ametikoht;
		this.instituut = instituut;
		this.aadress = aadress;
		this.ruum = ruum;
		this.telefon = telefon;
		this.email = email;
	}

	public Oppejoud() {
		// TODO Auto-generated constructor stub
	}

	public int getOppejoud_id() {
		return oppejoud_id;
	}

	public void setOppejoud_id(int oppejoud_id) {
		this.oppejoud_id = oppejoud_id;
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

	public String getAmetikoht() {
		return ametikoht;
	}

	public void setAmetikoht(String ametikoht) {
		this.ametikoht = ametikoht;
	}

	public String getInstituut() {
		return instituut;
	}

	public void setInstituut(String instituut) {
		this.instituut = instituut;
	}

	public String getAadress() {
		return aadress;
	}

	public void setAadress(String aadress) {
		this.aadress = aadress;
	}

	public String getRuum() {
		return ruum;
	}

	public void setRuum(String ruum) {
		this.ruum = ruum;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
