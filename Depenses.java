package appli;
import java.util.*;
/**Classe Entreprise
 * 
 * @author mayel
 *
 */

public class Depenses {
	//Attributs 
	protected ArrayList<Produit> depenses;
	
	//Constructeurs
	public Depenses() {
		depenses = new ArrayList<Produit>();
	}
	
	//Methodes
	/** permet d ajouter un produit à la liste depenses*/
	public void addDepenses(Produit p) {
		depenses.add(p);
	}
	
	/** permet de supprimer un produit à la liste depenses*/
	public void removeDepenses(Produit p) {
		depenses.remove(p);
	}
	
	/** permet d ajouter les produits d une facture à la liste depenses*/
	public void addProdFacture(Facture f) {
		int i;
		for(i=0; i<f.produits.size();i++) {
			addDepenses(f.produits.get(i));
		}
	}
	
	/** permet de supprimer les produits d une facture à la liste depenses*/
	public void removeProdFacture(Facture f) {
		int i;
		for(i=0; i<f.produits.size();i++) {
			removeDepenses(f.produits.get(i));
		}
	}
	
	/**permet de retourner le calcul du total de depenses */
	public double calculTotDepenses() {
		int i; 
		double totDepenses=0;
		for(i=0; i<depenses.size();i++) {
			totDepenses = depenses.get(i).calculMontant();
		}
		return totDepenses;
		
	}
	
	/**permet de redéfinir l affichage des dacractéristiques de la classe Ventes 
	public String toString() {
		return "";
	}*/
}
