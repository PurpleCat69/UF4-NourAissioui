package Act7_ActAquari;

public class Planta extends Organisme{
	private char tipus;
	
	public Planta(String nom, String familia, char llum, double tempMax, double tempMin, double phMax, double phMin, char tipus) {
		super(nom, familia, llum, tempMax, tempMin, phMax, phMin);
		this.tipus=tipus;
	}

	public String dadesMostrar() {
		return "Nom: "+this.getNom()+"\n" +"Acidesa: "+this.margesAcidesa()+"\n"+"Temperatura: "+this.margesTemperatura()+"\n"+"Llum: "+this.traduirLlum()+"\n"+"Tipus: "+this.tipusPlanta()+"\n";
	}
	public char getTipus() {
		return tipus;
	}
	public void setTipus(char tipus) {
		this.tipus = tipus;
	}

	public String tipusPlanta() {
        if (tipus == 'T') {
                return "De tipus `tija`.";
        }else if (tipus == 'B') {
                return "De tipus `bulb`.";
        }else if (tipus == 'A') {
                return "De tipus `arrel`";
        }else 
                return "";
        }
    }

