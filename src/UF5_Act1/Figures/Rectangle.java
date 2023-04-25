package UF5_Act1.Figures;

public class Rectangle implements Figura{
	private float base;
	private float altura;

	public Rectangle (float base, float altura) {
		this.base=base;
		this.altura=altura;
	}
	
	public float area() {
		return (float)base*altura;
	}
	
	public float perimetre() {
		return (float)base*2+altura*2;
	}
	
	public String toString() {
		return "L'àrea del rectangle és: "+area()+"cm2, i el perímetre és: "+perimetre()+"cm2. \n";
	}
}
