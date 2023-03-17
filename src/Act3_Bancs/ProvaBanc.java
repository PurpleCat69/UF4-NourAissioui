package Act3_Bancs;

public class ProvaBanc {

	public static void main(String[] args) {
		Banc bbva = new Banc("BBVA");
		Banc caixa = new Banc("La Caixa");

		Titular juan = new Titular("44556677K","Juan", "Garcia Martinez");
		Titular pedro = new Titular("44556678L","Pedro", "Lorca Benitez");
		Titular ana = new Titular("44556679J","Ana", "Torres Garriga");

		Compte c01 = new Compte ("435-0-2367800",juan);
		Compte c02 = new Compte ("435-0-2367805",pedro,3000);
		Compte c03 = new Compte ("207-1-0004572",ana,8200);
		Compte c04 = new Compte ("207-1-0004573",juan,100);

		bbva.nouCompte(c01);
		bbva.nouCompte(c02);
		caixa.nouCompte(c03);
		caixa.nouCompte(c04);

		System.out.print(bbva.toString());
		}
	}
