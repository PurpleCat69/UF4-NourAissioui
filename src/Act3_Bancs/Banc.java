package Act3_Bancs;

public class Banc {
	private String nom;
	private Compte [] nouCompte;
	private int contador=0;

	public Banc (String nom) {
		 this.nom=nom;
	     this.nouCompte =  new Compte [10];
	     contador=0;
	}
	public Banc (int max, int contador) {
       this.nouCompte =  new Compte [max];
       this.contador = contador;
   }
	public Compte[] getNouCompte() {
		return nouCompte;
	}
	public void nouCompte(Compte compte) {
		this.nouCompte[contador]=compte;
		this.contador++;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return (toStringBanc() + toStringCompte());
	}
	
	public String toStringBanc() {
		return ("Nom: "+ nom + "\n");
	}
	
	public String toStringCompte() {
        String result = " ";
       for(Compte c: this.nouCompte) {
        if (c!=null) {
        	result = result + c.toString()+"\n";
        }
    }
       return result;
  }
}
