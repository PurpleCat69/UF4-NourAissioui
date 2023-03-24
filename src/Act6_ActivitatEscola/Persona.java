package Act6_ActivitatEscola;

public class Persona {
	private String nom;
	private String adreca;
	
	public Persona (String nom, String adreca) {
		this.nom=nom;
		this.adreca=adreca;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdreca() {
		return adreca;
	}
	public void setAdreca(String adreca) {
		this.adreca = adreca;
	}
	
	public String toString() {
		return ("Nom: "+nom+ ". Adreça:"+adreca);
	}

}
