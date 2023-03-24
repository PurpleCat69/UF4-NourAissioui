package Act6_ActivitatEscola;
import java.util.HashSet;

public class Professor extends Persona{
	private HashSet<Assignatura> assignatures;
	
	public Professor (String nom, String adreca) {
		super (nom, adreca);
		this.assignatures=new HashSet <Assignatura>() ;
	}
	
	public boolean afegirAssignatura(Assignatura as) {
		assignatures.add(as);
		return true;
	}
	public boolean treuAssignatura(Assignatura as) {
		assignatures.remove(as);
		return true;
	}
	public HashSet<Assignatura> getAssignatures() {
		return assignatures;
	}
	public void setAssignatures(HashSet<Assignatura> assignatures) {
		this.assignatures = assignatures;
	}
	public void removeAssignatures(HashSet<Assignatura> assignatures) {
		this.assignatures = assignatures;
	}
	
	public String toString() {
		String assignatura = " ";
		for (Assignatura as : assignatures) {
			assignatura+=as+" ";
		}
		return ("Nom: "+getNom()+ "\n"+". Adreça:"+getAdreca()+"\n"+". Assignatures: "+ assignatura+"\n");
		
	}
}
