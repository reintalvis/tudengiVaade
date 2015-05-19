package tudengivaade.controller;

import java.util.Date;
/**
 * Lõputöö teemade kohta käivate kommentaaride andmeid talletav klass
 * @author Admin
 *
 */
public class TeemaKommentaar {
	
	private int kommentaar_id;
	private String postitus;
	private Oppejoud oppejoud;
	private Tudeng tudeng;
	private Date aeg;
	
	
	/**
	 * 
	 * @param kommentaar_id
	 * @param postitus
	 * @param oppejoud
	 * @param tudeng
	 * @param aeg
	 */
	public TeemaKommentaar(int kommentaar_id, String postitus,
			Oppejoud oppejoud, Tudeng tudeng, Date aeg) {
		super();
		this.kommentaar_id = kommentaar_id;
		this.postitus = postitus;
		this.oppejoud = oppejoud;
		this.tudeng = tudeng;
		this.aeg = aeg;
	}
	

	public int getKommentaar_id() {
		return kommentaar_id;
	}
	public void setKommentaar_id(int kommentaar_id) {
		this.kommentaar_id = kommentaar_id;
	}
	public String getPostitus() {
		return postitus;
	}
	public void setPostitus(String postitus) {
		this.postitus = postitus;
	}
	public Oppejoud getOppejoud() {
		return oppejoud;
	}
	public void setOppejoud(Oppejoud oppejoud) {
		this.oppejoud = oppejoud;
	}
	public Tudeng getTudeng() {
		return tudeng;
	}
	public void setTudeng(Tudeng tudeng) {
		this.tudeng = tudeng;
	}
	public Date getAeg() {
		return aeg;
	}
	public void setAeg(Date aeg) {
		this.aeg = aeg;
	}
	
	
	
	
	

}
