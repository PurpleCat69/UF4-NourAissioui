package Act4_hotelTasca;

public class Hotel {
	private String nom;
	private int estrelles;
	public Habitacio [] llista_hab;
	private int MAX_HAB;
	public Reserva [] llista_reserves;
	
	public Hotel (String nom) {
		this.nom=nom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getEstrelles() {
		return estrelles;
	}
	public void setEstrelles(int estrelles) {
		this.estrelles = estrelles;
	}
	public Habitacio[] getLlista_hab() {
		return llista_hab;
	}
	public void setLlista_hab(Habitacio[] llista_hab) {
		this.llista_hab = llista_hab;
	}
	public int getMAX_HAB() {
		return MAX_HAB;
	}
	public void setMAX_HAB(int mAX_HAB) {
		MAX_HAB = mAX_HAB;
	}
	public Reserva[] getLlista_reserves() {
		return llista_reserves;
	}
	public void setLlista_reserves(Reserva[] llista_reserves) {
		this.llista_reserves = llista_reserves;
	}
	
	public void habitacionsDisponibles() {
		
	}
	
}
