package actUF4;

public class Institut {

	private String nom;
	private Alumne [] llistaAlumnes;;
	private int num;
	private int contAlumnes;
	
	public Institut (String nom, int num) {
		 this.nom = nom;
	     this.llistaAlumnes =  new Alumne [100];
	     this.num = num;
	}
	public Institut(String nom, int max, int contador) {
        this.nom = nom;
        this.llistaAlumnes =  new Alumne [max];
        this.num = contAlumnes;
    }
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setLlistaAlumnes(Alumne[] llistaAlumnes) {
		this.llistaAlumnes = llistaAlumnes;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void crearLlista() {
		this.nom =nom;
		this.llistaAlumnes = new Alumne[100];
		this.contAlumnes=0;
	}
	public void afegirAlumne(Alumne al) {
		this.llistaAlumnes[contAlumnes]=al;
		this.contAlumnes++;
	}
	public int getContAlumnes() {
		return contAlumnes;
	}
	public void setContAlumnes(int contAlumnes) {
		this.contAlumnes = contAlumnes;
	}
	public Alumne[] getLlistaAlumnes() {
		return llistaAlumnes;
	}
	
}
