package Act6_ActivitatEscola;

public class EstudiantInternacional extends Estudiant{
	private String pais;

	public EstudiantInternacional (String nom, String adreca, String cicle, int curs, String pais) {
		super(nom, adreca,cicle, curs);
		this.pais=pais;
	}
	
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	public String toString() {
		return (("Nom: "+getNom()+ "\n"+". Adreça:"+getAdreca()+"\n"+" .Cicle: "+getCicle()+"\n"+". Curs: "+getCurs()+ "\n"+". País: "+pais));
	}

}
