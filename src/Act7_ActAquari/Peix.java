package Act7_ActAquari;

public class Peix extends Organisme{
	private String procedencia;
	private char dieta;
	private double longitud;
	
	public Peix(String nom, String familia, char llum, double tempMax, double tempMin, double phMax, double phMin, String procedencia, char dieta, double longitud) {
		super(nom, familia, llum, tempMax, tempMin, phMax, phMin);
		this.procedencia=procedencia;
		this.dieta=dieta;
		this.longitud=longitud;
	}
	
	public String dadesMostrar() {
		return "Nom: "+this.getNom()+"\n" +"Acidesa: "+this.margesAcidesa()+"\n"+"Temperatura: "+this.margesTemperatura()+"\n"+"Llum: "+this.traduirLlum()+"\n"+"Longitud: "+this.longitud+"\n"+"Dieta: "+this.tipusDieta()+"\n";
	}
	public String getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	public char getDieta() {
		return dieta;
	}
	public void setDieta(char dieta) {
		this.dieta = dieta;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	public String tipusDieta() {
        switch (dieta) {
            case 'A':
                return "Algues.";
            case 'O':
                return "Omnívora.";
            case 'F':
                return "Fulles.";
            default:
                return "";
        }
    }


	

}
