package appli;
import java.util.*;
/**Classe Entreprise
 * 
 * @author mayel
 *
 */

public class Facture {
	//Attributs
	private Entreprise entreprise;
	private Client client;
	private static int numFacture=0;
	private String date;
	protected ArrayList<Produit> produits;
	
	
	//Constructeurs
	public Facture (Entreprise entreprise, Client client, String date) {
		this.entreprise = entreprise;
		this.client = client;
		this.date = date; 
		produits = new ArrayList<Produit>();
		numFacture++;
	}
	
	//Methodes
	/**permet d'ajouter un produit à la facture */
	public void addProduit(Produit p) {
		produits.add(p);
	}
	
	/**permet de supprimer un produit de la facture */
	public void removeProduit(Produit p) {
		produits.remove(p);
	}
	
	/**permet de retourner le calucul du total Hors Taxe */
	public double calculTotHT() {
		int i; 
		double totHT=0;
		for(i=0; i<produits.size();i++) {
			totHT = produits.get(i).calculMontant();
		}
		return totHT;
	}
	
	/**permet de retourner le calcul de la TVA*/
	public double calculTVA() {
		return (calculTotHT()*18)/100;
	}
	
	/**permet de calculer le total TTC*/
	public double calculTotTTC() {
		return calculTotHT() + calculTVA();
	}
	
	/** redefinition de toString pour afficher les caractéristiques de la facture */
	public String toString() {
		return entreprise + "\n" + client + "\nNumero facture: " + numFacture + "\nDate: " + date;
		//"\nTOTAL HT: " + calculTotHT() + "\nTVA: " + calculTVA() + "\nTOTAL TTC: " + calculTotTTC()
	}
}
