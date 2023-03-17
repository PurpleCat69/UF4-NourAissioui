package Act3_Bancs;

public class Titular {
	private String DNI;
	private String nom;
	private String cognom;
	
	public Titular (String DNI, String nom, String cognom) {
		this.DNI=DNI;
		this.nom=nom;
		this.cognom=cognom;
	}
	
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCognom() {
		return cognom;
	}
	public void setCognom(String cognom) {
		this.cognom = cognom;
	}
	public String toString() {
        return "\n"+"DNI: "+ DNI + ". Nom: " + nom +" "+cognom+ "\n";
    }
}
