package Act8_ActivitatInformatica;

public class DiscDur extends Article{
	private float capacitat;
	
	public DiscDur (String codi, String descripcio, int unitats, float preuBase, float capacitat) {
		super(codi, descripcio, unitats, preuBase);
		this.capacitat=capacitat;
	}
	
	public String toString() {
		return super.toString()+ + capacitat+ "GB		"+calcularPreuFinal();
	}
	public float getCapacitat() {
		return capacitat;
	}
	public void setCapacitat(float capacitat) {
		this.capacitat = capacitat;
	}
	public float calcularPreuFinal() {
        return this.getPreuBase() * capacitat * 0.9f;
    }
}
