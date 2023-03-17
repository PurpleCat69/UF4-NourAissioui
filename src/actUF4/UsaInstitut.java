package actUF4;

public class UsaInstitut {

	public static void main(String[] args) {
		Institut JaumeHuguet = new Institut ("Jaume Huguet", 100);   //mai posem les variables en majuscules
		Institut NarcísOller = new Institut ("Narcís Oller", 100);
		
		Alumne Alexis = new Alumne ("Alexis", 19, "P2976765", "alexis@gmail.com");
		Alumne Arnau = new Alumne ("Arnau", 17, "U9287362", "arnau@gmail.com");
		Alumne Manel = new Alumne ("Manel", 21, "Q1847489", "manel@gmail.com");
		Alumne Nour = new Alumne ("Nour", 20, "X6325925", "nour@gmail.com");
		Alumne Daniel = new Alumne ("Daniel", 34, "S9846792", "daniel@gmail.com");
		Alumne Ismael = new Alumne ("Ismael", 23, "Z83629335", "ismael@gmail.com");
		
		JaumeHuguet.crearLlista();
		JaumeHuguet.afegirAlumne(Alexis);
		JaumeHuguet.afegirAlumne(Daniel);
		JaumeHuguet.afegirAlumne(Ismael);
		NarcísOller.crearLlista();
		NarcísOller.afegirAlumne(Nour);
		NarcísOller.afegirAlumne(Arnau);
		NarcísOller.afegirAlumne(Manel);
		
		for(int i=0; i<3; i++){                            // podries millirar-la amb els toString
			System.out.println("Alumnes del Jaume Huguet: ");
			System.out.println(JaumeHuguet.getLlistaAlumnes()[i].getNom());
			System.out.println("Alumnes del Jaume Huguet: ");
			System.out.println(NarcísOller.getLlistaAlumnes()[i].getNom());
		}

	}

}
