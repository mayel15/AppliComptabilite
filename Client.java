package appli;
/**Classe Entreprise
 * 
 * @author mayel
 *
 */
public class Client {
	//Attributs
	private String nom;
	private static int numClient=0;
	private String email;
	
	//Constructeurs 
	/** constructeur avec parametres nom et email */
	public Client(String nom, String email) {
		this.nom = nom;
		this.email = email;
		numClient++;
	}
	
	/** constructeur avec parametres nom */
	public Client(String nom) {
		this.nom = nom; 
		numClient++;
	}
	
	//Methodes
	/** getteur permettant de retourner le nom du client */
	public String getNom() {
		return nom;
	}
	
	/** setteur permettant de modifier le nom du client */
	public void setNom(String newNom) {
		 nom = newNom;
	}
	
	/** getteur permettant de retourner l email du client */
	public String getEmail() {
		return email;
	}
	
	/** setteur permettant de modifier l email du client */
	public void setEmail(String newEmail) {
		 email = newEmail;
	}
	
	/** getteur permettant de retourner le numero du client */
	public int getNumClient() {
		return numClient;
	}
	
	/** redefinition de toString pour afficher les caractéristiques du client */
	public String toString() {
		return "Client: " + nom + "\nNumero Client: " + numClient + "\nEmail: " + email;
	}
	
}
