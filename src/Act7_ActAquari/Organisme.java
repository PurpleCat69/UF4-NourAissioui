package Act7_ActAquari;

public abstract class Organisme {
	private String nom;
	private String familia;
	private char llum;
	private double tempMax;
	private double tempMin;
	private double phMax;
	private double phMin;
	
	public Organisme(String nom, String familia, char llum, double tempMax, double tempMin, double phMax, double phMin) {
		this.nom=nom;
		this.familia=familia;
		this.llum=llum;
		this.tempMax=tempMax;
		this.tempMin=tempMin;
		this.phMax=phMax;
		this.phMin=phMin;
	}
	
	public  abstract String dadesMostrar();

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	public char getLlum() {
		return llum;
	}
	public void setLlum(char llum) {
		this.llum = llum;
	}
	public double getTempMax() {
		return tempMax;
	}
	public void setTempMax(double tempMax) {
		this.tempMax = tempMax;
	}
	public double getTempMin() {
		return tempMin;
	}
	public void setTempMin(double tempMin) {
		this.tempMin = tempMin;
	}
	public double getPhMax() {
		return phMax;
	}
	public void setPhMax(double phMax) {
		this.phMax = phMax;
	}
	public double getPhMin() {
		return phMin;
	}
	public void setPhMin(double phMin) {
		this.phMin = phMin;
	}
	
    public String margesAcidesa() {
        return phMin + "-" + phMax;
    }

    public String margesTemperatura() {
        return tempMin + "-" + tempMax;
    }

    public String traduirLlum() {
        switch (llum) {
            case 'A':
                return "Necessitats altes de llum";
            case 'M':
                return "Necessitats mitjanes de llum";
            case 'B':
                return "Necessitats baixes de llum";
            default:
                return "";
        }
    }
        
        
        
}
