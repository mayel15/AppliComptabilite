package appli;
/**Classe Entreprise
 * 
 * @author mayel
 *
 */

public class Entreprise {
	//Attributs 
	protected String nom;
	private String adresse;
	private int codePostal;
	private long numTel;
	
	//Contructeurs
	/** Constructeur avec paramètre le nom*/
	public Entreprise(String nom) {
		this.nom = nom;
	}
	
	/** Constructeur avec paramètre le nom, et le numTel*/
	public Entreprise(String nom, long numTel) {
		this.nom = nom;
		this.numTel = numTel;
	}
	
	/** Constructeur avec paramètre le nom, et le numTel*/
	public Entreprise(String nom, String adresse, int codePostal, long numTel) {
		this.nom = nom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.numTel = numTel;
	}
	
	//Methodes
	/** getteur permettant de retourner le nom de l'entreprise */
	public String getNom() {
		return nom;
	}
	
	/** setteur permettant de modifier le nom de l'entreprise */
	public void setNom(String newNom) {
		 nom = newNom;
	}
	
	/** getteur permettant de retourner le nom de l'entreprise */
	public long getNumTel() {
		return numTel;
	}
	
	/** setteur permettant de modifier le numTel de l'entreprise */
	public void setNumTel(long newNumTel) {
		 numTel = newNumTel;
	}
	
	/** setteur permettant de modifier l adresse de l'entreprise */
	public void setAdresse(String newAdresse) {
		 adresse = newAdresse;
	}
	
	/** setteur permettant de modifier le code postal de l'entreprise */
	public void setCodePostal(int newCodePostal) {
		 codePostal = newCodePostal;
	}
	
	/** redefinition de toString pour afficher les caractéristiques de l'entreprise */
	public String toString() {
		return "Nom Entreprise: " + nom + "\nAdresse: " + adresse + "\nCode Postale: " + codePostal + "\nNumero telephone: " + numTel;
	}
}
