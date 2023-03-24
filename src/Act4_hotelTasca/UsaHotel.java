package Act4_hotelTasca;

public class UsaHotel {

	public static void main(String[] args) {
		Hotel ritz = new Hotel("Ritz");
		
		Habitacio primera = new Habitacio(101, "normal", 2, 60, null, false);
		Habitacio segona = new Habitacio(102, "normal", 2, 60, null, true);
		Habitacio tercera = new Habitacio(103, "normal", 1, 60, null, true);
		Habitacio quarta = new Habitacio(201, "luxe", 2, 100, null, true);
		Habitacio cinquena = new Habitacio(202, "normal", 1, 100, null, false);
		Habitacio sisena = new Habitacio(301, "superluxe", 3, 200, null, false);
		
		Client ana = new Client("Ana", "34534567W", "2300-8-345246");
		Client pedro = new Client("Pedro", "33545567X", "2336-5-493888");
		Client eva = new Client("Eva", "44567700G", "2009-2-569375");
		
		Reserva primera = new Reserva();
	}

}
