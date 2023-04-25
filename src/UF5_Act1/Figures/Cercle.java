package UF5_Act1.Figures;

public class Cercle implements Figura{
	private float radi;
	
	public Cercle (float radi) {
		this.radi=radi;
	}
	
	public float area() {
		return (float) (2*Math.PI*(radi*radi));
	}
	
	public float perimetre() {
		return (float) (2*Math.PI*radi);
	}
	
	public String toString() {
		return "L'àrea del cercle és: "+area()+"cm2, i el perímetre és: "+perimetre()+"cm2. \n";
	}
}
