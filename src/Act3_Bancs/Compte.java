package Act3_Bancs;

public class Compte {
	private String numCompte;
	private Titular tit;
	private double saldo;
	
	public Compte (String numCompte, Titular tit) {
		this.numCompte=numCompte;
		this.tit=tit;
	}
	public Compte (String numCompte, Titular tit, double saldo) {
		this.numCompte=numCompte;
		this.tit=tit;
		this.saldo=saldo;
	}
	public String getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}
	public Titular getTit() {
		return tit;
	}
	public void setTit(Titular tit) {
		this.tit = tit;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String toString() {
        return "Compte: "+ numCompte + ". Saldo: " + saldo +tit.toString();
    }
}
