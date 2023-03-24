package Act4_hotelTasca;

public class Reserva {
	public int id;
	public Client client;
	public Habitacio habitacio;
	public int dies;
	public int preu_total;
	
	public Reserva (int id, Client client, Habitacio habitacio, int dies, int preu_total) {
		this.id=id;
		this.client=client;
		this.habitacio=habitacio;
		this.dies=dies;
		this.preu_total=preu_total;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Habitacio getHabitacio() {
		return habitacio;
	}

	public void setHabitacio(Habitacio habitacio) {
		this.habitacio = habitacio;
	}

	public int getDies() {
		return dies;
	}

	public void setDies(int dies) {
		this.dies = dies;
	}

	public int getPreu_total() {
		return preu_total;
	}

	public void setPreu_total(int preu_total) {
		this.preu_total = preu_total;
	}
	

}
