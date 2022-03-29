package appli;

/**
 * 
 * @author mayel
 *
 */

public class Produit {
	//Attributs 
	private String libelle;
	private int quantite;
	private double prixUnitaire;
	private String date;
	private String typePaiement;
	private String beneficiaire;
	
	
	//Constructeurs 
	/**Constructeur avec parametres libelle, quantite, prixUnitaire */
	public Produit(String libelle, int quantite, double prixUnitaire) {
		this.libelle = libelle;
		this.quantite = quantite;
		this.prixUnitaire = prixUnitaire;	
	}
	
	/**Constructeur avec parametres libelle, quantite, prixUnitaire, date */
	public Produit(String libelle, int quantite, double prixUnitaire, String date, String typePaiement, String beneficiaire) {
		this.libelle = libelle;
		this.quantite = quantite;
		this.prixUnitaire = prixUnitaire;
		this.date = date;
		this.typePaiement = typePaiement;
		this.beneficiaire = beneficiaire;
	}
	
	
	//Methodes
	/** retourne le calcul du montant */ 
	public double calculMontant() {
		return quantite*prixUnitaire;
	}
	
	/** getteur permettant de retourner le libelle du produit */
	public String getLibelle() {
		return libelle;
	}
	
	/** setteur permettant de modifier le libelle du produit */
	public void setLibelle(String newLibelle) {
		 libelle = newLibelle;
	}
	
	/** getteur permettant de retourner le prix unitaire du produit */
	public double getPrixUnitaire() {
		return prixUnitaire;
	}
	
	/** setteur permettant de modifier le prix unitaire du produit */
	public void setPrixUnitaire(double newPrixUnitaire) {
		 prixUnitaire = newPrixUnitaire;
	}
	
	/** getteur permettant de retourner la quantite du produit */
	public int getQuantite() {
		return quantite;
	}
	
	/** setteur permettant de modifier la quantite du produit */
	public void setQuantite(int newQuantite) {
		 quantite = newQuantite;
	}
	
	/** redefinition de toString pour afficher les caractéristiques du client */
	public String toString() {
		return "Libelle Produit: " + libelle + "\nQuantite : " + quantite 
				+ "\nPrix unitaire : " + prixUnitaire + "\nDate: " + date 
				+ "\nType paiement: " + typePaiement + "\nBeneficiaire: " + beneficiaire 
				+ "\nMontant: " + calculMontant() + ";\n";
	}
	
	
}
