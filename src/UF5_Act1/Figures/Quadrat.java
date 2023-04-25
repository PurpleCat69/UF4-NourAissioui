package UF5_Act1.Figures;

public class Quadrat implements Figura  {
	private float costat;
	
	public Quadrat (float costat) {
		this.costat=costat;
	}
	
	public float area() {
		
		return (float)costat*costat;
	}
	
	public float perimetre() {
		return (float)costat*4;
	}
	
	public String toString() {
		return "L'àrea del quadrat és: "+area()+"cm2, i el perímetre és: "+perimetre()+"cm2. \n";
	}
}
