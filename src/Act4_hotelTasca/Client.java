package Act4_hotelTasca;

public class Client {
	private String nom;
	private String dni;
	private String targeta;
	
	public Client (String nom, String dni, String targeta){
		this.nom=nom;
		this.dni=dni;
		this.targeta=targeta;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getTargeta() {
		return targeta;
	}
	public void setTargeta(String targeta) {
		this.targeta = targeta;
	}
	
	public String toString() {
        return "Nom: "+ nom + ". DNI: " + dni +". Trageta: "+targeta+ "\n";
    }
}
