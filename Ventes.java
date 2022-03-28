package appli;
import java.util.*;
/**Classe Entreprise
 * 
 * @author mayel
 *
 */

public class Ventes {
	//Attributs 
	protected ArrayList<Produit> ventes;
	private double servicesVendus;
	
	//Constructeurs
	/** constructeur sans parametres*/
	public Ventes () {
		ventes = new ArrayList<Produit>();
	}
	
	/** constructeur avec parametre Services vendus*/
	public Ventes(double servicesVendus){
		this.servicesVendus = servicesVendus;
	}

	
	//Methodes
	/** c est un getteur qui permet de retourner le montant du service vendu */
	public double getServicesVendus() {
		return servicesVendus;
	}
	
	/** permet d ajouter un produit à la liste ventes*/
	public void addVentes(Produit p) {
		ventes.add(p);
	}
	
	/** permet de supprimer un produit à la liste ventes*/
	public void removeVentes(Produit p) {
		ventes.remove(p);
	}
	
	/** permet d ajouter les produits d une facture à la liste ventes*/
	public void addProdFacture(Facture f) {
		int i;
		for(i=0; i<f.produits.size();i++) {
			addVentes(f.produits.get(i));
		}
	}
	
	/** permet de supprimer les produits d une facture à la liste ventes*/
	public void removeProdFacture(Facture f) {
		int i;
		for(i=0; i<f.produits.size();i++) {
			removeVentes(f.produits.get(i));
		}
	}
	
	/**permet de retourner le calcul du total de ventes */
	public double calculTotVentes() {
		int i; 
		double totVentes=0;
		for(i=0; i<ventes.size();i++) {
			totVentes = ventes.get(i).calculMontant();
		}
		return totVentes;
		
	}
	
	/**permet de redéfinir l affichage des dacractéristiques de la classe Ventes  
	public String toString() {
		return "";
	}*/
}
