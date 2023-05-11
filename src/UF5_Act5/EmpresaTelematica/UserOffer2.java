package UF5_Act5.EmpresaTelematica;

import java.text.ParseException;

public class UserOffer2 extends UserWithOffer{
	private double discount;
	
	public UserOffer2(String name, String dni, double priceMinute, double discount) {
		super (name, dni, priceMinute);
		this.discount=discount;
	}

	public double billAmount() {
		double totalBill=0;
		double discount=0;
		for (Connection c : connections){
			try {
				totalBill += c.nMinutes();
			} catch (ParseException error) {
				error.printStackTrace();
			}
		}
		totalBill*=this.priceMinute;
		discount=(totalBill *this.discount )/ 100;
		return totalBill-discount;
	}
	
	public String toString() {
		 try {
			return "Dni: "+this.getDni()+"	Nom:"+this.getName()+"	Connexions:"+this.getConnections().size()+"	Minuts:"+this.totalMinutes()+"	Oferta:Si	Factura:"+this.billAmount();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		 return"";
	}
}
