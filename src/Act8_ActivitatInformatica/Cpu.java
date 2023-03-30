package Act8_ActivitatInformatica;

public class Cpu extends Article{
	private float velocitat;
	
	public Cpu (String codi, String descripcio, int unitats, float preuBase, float velocitat) {
		super(codi, descripcio, unitats, preuBase);
		this.velocitat=velocitat;
	}

	public float getVelocitat() {
		return velocitat;
	}
	public void setVelocitat(float velocitat) {
		this.velocitat = velocitat;
	}
	public String toString() {
		return super.toString()+ + velocitat+ "Mhz	"+calcularPreuFinal();
	}

	public float calcularPreuFinal() {
        return this.getPreuBase() * velocitat;
    }
}
