package UF5_Act5.EmpresaTelematica;
import java.util.HashSet;

public class Company {
	private HashSet<User> users = new HashSet<User>();
	
	public Company() {
		this.users = new HashSet<User>();
	}

	public boolean add(User u) {
		for (User users : users) {
			if(users.getDni().equals(u.getDni())){
				System.out.println("Dni duplicat!! No hem afegit: "+u.getName());
				return false;
			}
		}
		System.out.println("Hem afegit l'usuari: "+u.getName());
		return this.users.add(u);
    }

	public void listUsers() {
		System.out.println(" ");
		System.out.println("CLIENTS:");
        for (User u : users) {
            System.out.println(u);
        }
	}
	
}
