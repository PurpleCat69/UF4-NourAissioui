package UF6_ActivitatsGenerals;

import java.util.*;
import javax.swing.JOptionPane;
import java.sql.*;

public class Act1_ConnexioAmbBDPel_lícules {

	private static Connection connexio;
	public final static String USER = "root";
	public final static String PASSW = "";
	public final static String database = "jdbc:mysql://localhost:3307/pelicules";
	public static final String nomTaula = "";
	public static int opcio =0;
	public static Scanner teclat = new Scanner (System.in);
	
	
	public static void connexio() {
		try {
			connexio = (Connection) DriverManager.getConnection(database, USER, PASSW);
			System.out.println("Server Connectat!! \n");
			
		}catch (SQLException error){
			System.out.println("No s'ha pogut connectar a la base de dades!!");
			error.printStackTrace();
		}
	}
	
	
	public static void connexioClose() {
		try {
			connexio.close();
			JOptionPane.showMessageDialog(null, "S'ha tancat la connexió amb la BD");
		}catch (SQLException error){
				System.out.println("Error al tancar la BD!!");
				error.printStackTrace();
			}
	}
	
	public static void getRegistres(String nomTaula) {
		try {
			String Query = "SELECT * FROM " +nomTaula;
			Statement st = connexio.createStatement();
			java.sql.ResultSet resultSet;
			resultSet = st.executeQuery(Query);
			resultSet = st.executeQuery("SELECT * FROM " +nomTaula);
			
			
			while (resultSet.next()) {
				switch (nomTaula){
				case "clients":
				System.out.println("ID Client: " + resultSet.getString("id_client") + "	"
						+ "Usuari Client: " + resultSet.getString("usuari") + "	"
						+ "Contrasenya Usuari: " + resultSet.getString("contrasenya") + "	");
					break;
				case "lloguers":
					System.out.println("ID Lloguer: " + resultSet.getString("id_lloguer") + "	"
							+ "ID Película: " + resultSet.getString("id_peli") + "	"
							+ "ID Client: " + resultSet.getString("id_client") + "	");
						break;
				case "pelicules":
					System.out.println("ID Peli: " + resultSet.getString("id_peli") + "	"
							+ "Nom Peícula: " + resultSet.getString("nom") + "	"
							+ "Director de la película: " + resultSet.getString("director") + "	"
							+ "Any de Producció: " + resultSet.getString("any_prod") + "	"
							+ "Estat de la película: " + resultSet.getString("llogada") + "	");
						break;
				}
			}
		}catch (SQLException error){
			System.out.println("Error a l'hora de treure les dades!!");
			error.printStackTrace();
			}
	}
	
	
	public static void main(String[] args) {

		connexio();
        String opcio;
        do {
            System.out.println("1. Introdueix el nom de la taula. ");
            System.out.println("2. Sortir del programa. \n");
            
            System.out.println("OPCIÓ: ");
             opcio = teclat.nextLine();
            switch(opcio) {
            	case "1":
            			System.out.println("Nom de la TAULA a consultar: ");
            			String nomTaula =teclat.nextLine();
            			getRegistres(nomTaula);
            			System.out.println("\n");
            		break;

            	case "2":
            			System.out.println("Has sortit del programa, fins aviat!");
            			connexioClose();
            			teclat.close();
            		break;
            		
            	default:
        			System.out.println("Opció incorrecta!! Elegeix una opció vàlida \n");
        			break;
            }
        }while(opcio != "2");
      }
	}
