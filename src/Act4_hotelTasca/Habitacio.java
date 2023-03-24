package Act4_hotelTasca;

public class Habitacio {
	private int numero;
	private String categoria;
	private int llits;
	private int preu;
	public  Client client;
	public boolean ocupat;
	
	public Habitacio (int numero, String categoria, int llits, int preu, boolean ocupat) {
		this.numero=numero;
		this.categoria=categoria;
		this.llits=llits;
		this.preu=preu;
		this.ocupat=ocupat;
	}
	
	public Habitacio (int numero, String categoria, int llits, int preu, Client client) {
		this.numero=numero;
		this.categoria=categoria;
		this.llits=llits;
		this.preu=preu;
		this.client=client;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getLlits() {
		return llits;
	}
	public void setLlits(int llits) {
		this.llits = llits;
	}
	public int getPreu() {
		return preu;
	}
	public void setPreu(int preu) {
		this.preu = preu;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public boolean isOcupat() {
		return ocupat;
	}
	public void setOcupat(boolean ocupat) {
		this.ocupat = ocupat;
	}
	
	public String toString() {
        return "Habitacio: "+ numero + ". Categoria: " + categoria +". Preu: "+preu+"\n";
    }
}
