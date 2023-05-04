package UF5_Act2.Notícies;
import java.util.ArrayList;

public class Categoria {
	private String nom;
	private ArrayList <String> paraulesClau = new ArrayList<String>();
	private ArrayList <Noticies>llistanoticies = new ArrayList<Noticies>();

	public Categoria(String nom) {
		this.nom=nom;
		this.paraulesClau = new ArrayList <String>();
	}

	public String toString() {
		return nom;
	}

	public ArrayList<String> getParaules() {
		return paraulesClau;
	}

	public String getNom() {
		return nom;
	}

	public ArrayList<Noticies> getLlistanoticies() {
		return llistanoticies;
	}
}
