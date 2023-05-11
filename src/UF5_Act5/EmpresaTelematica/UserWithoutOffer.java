package UF5_Act5.EmpresaTelematica;
import java.text.ParseException;
import java.util.*;

public class UserWithoutOffer extends User{
	
	public UserWithoutOffer(String name, String dni, double priceMinute) {
		super (name, dni, priceMinute);
	}
	
	public double billAmount() {
		double totalMinutes=0;
		for (Connection c : connections){
			try {
				totalMinutes += c.nMinutes();
			} catch (ParseException error) {
				error.printStackTrace();
			}
			
		}
		return totalMinutes*this.priceMinute;
	}
	
	public String toString() {
		 try {
			return "Dni: "+this.getDni()+"	Nom:"+this.getName()+"	Connexions:"+this.getConnections().size()+"	Minuts:"+this.totalMinutes()+"	Oferta:No	Factura:"+this.billAmount();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		 return"";
	}
}
