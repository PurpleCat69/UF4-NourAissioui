package Act8_ActivitatInformatica;

public abstract class Article {
	private String codi;
	private String descripcio;
	private int unitats;
	private float preuBase;
	
	public Article (String codi, String descripcio, int unitats, float preuBase) {
		this.codi=codi;
		this.descripcio=descripcio;
		this.unitats=unitats;
		this.preuBase=preuBase;
	}

	public String toString() {
		return codi +"		"+descripcio+"		"+unitats+ "		";
	}
	
	public String getCodi() {
		return codi;
	}
	public void setCodi(String codi) {
		this.codi = codi;
	}
	public String getDescripcio() {
		return descripcio;
	}
	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}
	public int getUnitats() {
		return unitats;
	}
	public void setUnitats(int unitats) {
		this.unitats = unitats;
	}
	public float getPreuBase() {
		return preuBase;
	}
	public void setPreuBase(float preuBase) {
		this.preuBase = preuBase;
	}

	public abstract float calcularPreuFinal();
}
