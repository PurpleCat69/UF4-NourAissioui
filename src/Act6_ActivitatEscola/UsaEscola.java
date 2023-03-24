package Act6_ActivitatEscola;

import java.util.HashSet;

public class UsaEscola {

	public static void main(String[] args) {
		Estudiant albert = new Estudiant("Albert", "Valls", "ASIX", 1);
		EstudiantInternacional lenny= new EstudiantInternacional("Lenny", "Valls", "DAM", 2, "USA");
		Professor joan = new Professor("Joan", "Cabra del Camp");
		

		joan.afegirAssignatura(Assignatura.ingles);
		joan.afegirAssignatura(Assignatura.historia);
		joan.afegirAssignatura(Assignatura.frances);
		
		System.out.println("Estudiant= "+albert+"\n");
		System.out.println("Estudiant Internacional= "+lenny+"\n");
		System.out.println("Professor= "+joan+"\n");
		
	}

}
