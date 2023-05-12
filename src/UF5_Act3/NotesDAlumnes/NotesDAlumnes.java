package UF5_Act3.NotesDAlumnes;
import java.util.*;

public class NotesDAlumnes {

	public static void main(String[] args) {
		HashMap<String, Integer> estudiants = new HashMap<String, Integer>();
        Scanner scanner = new Scanner(System.in);

        // Demana a l'usuari que ingressi el nom i la nota de cada estudiant
        while (true) {
            System.out.print("Nom de l'estudiant (o 'fi' per sortir): ");
            String nom = scanner.nextLine();
            if (nom.equals("fi")) {
                break;
            }

            System.out.print("Nota de " + nom + ": ");
            int nota = scanner.nextInt();
            scanner.nextLine(); // Consumir la nova línia deixada per nextInt()

            // Emmagatzema el nom i la nota de l'estudiant al HashMap
            estudiants.put(nom, nota);
        }

        // Ordena el HashMap per clau (nom de l'estudiant) i mostra els resultats
        TreeMap<String, Integer> estudiantsOrdenats = new TreeMap<String, Integer>(estudiants);
        for (Map.Entry<String, Integer> estudiant : estudiantsOrdenats.entrySet()) {
            System.out.println(estudiant.getKey() + ": " + estudiant.getValue());
        }
    }
}
