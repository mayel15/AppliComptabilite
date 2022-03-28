package appli;
/**Classe Entreprise
 * 
 * @author mayel
 *
 */
public class EFinancier {
	//Attributs 
	private String[][] tabFinance;
	private Ventes v;
	private Depenses d;
	private double autresProduits;
	private double autresCharges;
	private double dotationAmort;
	private double repriseAmort;
	private double chargesFinancieres;
	private double produitsFinanciers;
	private double montantRF;
	private double montantRHAO;
	private double montantProduitsHAO;
	private double montantChargesHAO;
	private double chargePersonnel;	
	private double ventesProdFabriques;
	
	//Constructeurs 
	public EFinancier(Ventes v, Depenses d, double autresProduits, double autresCharges, double dotationAmort, double repriseAmort, double ventesProdFabriques,
			double chargesFinancieres, double produitsFinanciers, double montantRF, double montantRHAO, double montantProduitsHAO, double montantChargesHAO, double chargePersonnel) {
		this.v = v;
		this.d = d;
		this.autresCharges = autresCharges;
		this.autresProduits = autresProduits;
		this.dotationAmort = dotationAmort;
		this.repriseAmort = repriseAmort;
		this.chargesFinancieres = chargesFinancieres;
		this.produitsFinanciers = produitsFinanciers;
		this.montantRF = montantRF;
		this.montantRHAO = montantRHAO;
		this.montantProduitsHAO = montantProduitsHAO;
		this.montantChargesHAO = montantChargesHAO;
		this.chargePersonnel = chargePersonnel;
		tabFinance = new String[25][2];
		tabFinance[0][0] = "Elements";
		tabFinance[0][1] = "Montant";
		tabFinance[1][1] = "Marchandises vendues";
		tabFinance[2][1] = "Marchandises achetees";
		tabFinance[3][1] = "Marge Commerciale";
		tabFinance[4][1] = "Ventes de produits fabriques";
		tabFinance[5][1] = "Services vendus";
		tabFinance[6][1] = "Chiffre d'affaire (CA)";
		tabFinance[7][1] = "Autres produits";
		tabFinance[8][1] = "Autres charges";
		tabFinance[9][1] = "Valeur ajoutee";
		tabFinance[10][1] = "Charge personnel";
		tabFinance[11][1] = "Excedent brut d'exploitation (EBE)";
		tabFinance[12][1] = "Dotation aux amortissements";
		tabFinance[13][1] = "Reprise aux amortissements";
		tabFinance[14][1] = "Resultat d'exploitaion (RE)";
		tabFinance[15][1] = "Produits financiers";
		tabFinance[16][1] = "Charges financieres";
		tabFinance[17][1] = "Resultats financiers (RF)";
		tabFinance[18][1] = "Hors produits HAO";
		tabFinance[19][1] = "Hors charges HAO";
		tabFinance[20][1] = "Resultat hors activites ordinaires (RHAO)";
		tabFinance[21][1] = "Resultat brut (RB)";
		tabFinance[22][1] = "Impots sur les societes (IS)";
		tabFinance[23][1] = "Resultat net (RN)";
		tabFinance[24][1] = "Capacite auto-financement";	
	}
	
	//Méthodes 
	/** calcul de la marge commerciale*/
	public double calculMC() {
		return v.calculTotVentes() - d.calculTotDepenses();
	}
	
	/** calcul du chiffre d'affaire*/
	public double calculCA() {
			return v.calculTotVentes();
	}
	
	/**calcul de la valeur ajoutée */
	public double calculVA() {
		return calculCA() + autresProduits - autresCharges;
		
	}
	
	/**calcul de l'excedent brut commercial  */
	public double calculEBE() {
		return calculCA() - d.calculTotDepenses() - autresCharges - chargePersonnel + repriseAmort;
	}
	
	/**calcul du resultat d'exploitation */
	public double calculRE() {
		return calculEBE()- dotationAmort + repriseAmort;
	}
	
	/**calcul du resultat brut */
	public double calculRB() {
		return calculRE() + montantRF + montantRHAO;
	}
	
	/**calcul de l'impot sur les societes*/
	public double calculIS() {
		return (calculRB()*30)/100;
	}
	
	/**calcul du resultat net */
	public double calculRN() {
		return calculRB() - calculIS();
	}
	
	/**Calcul de la capacite de l'auto financement */
	public double calculCAF() {
		return calculRN() + dotationAmort - repriseAmort;
	}
	
	/** redefinition de toString pour l'affichage des caracteristiques de l'etats financiers*/
	public String toString() {
		return "Marchandises vendues: " + v.calculTotVentes() + "\nMarchandises achetees: " + d.calculTotDepenses()
		+ "\nMarge Commerciale: " + calculMC() + "\nVentes de produits fabriques: " + ventesProdFabriques +"\nServices vendus: " + v.getServicesVendus() + "\nChiffre d'affaire: " + calculCA()
		+ "\nAutres produits: " + autresProduits +"\nAutres charges: " + autresCharges + "\nValeur ajoutee: " + calculVA() + "\nCharge personnel: " + chargePersonnel + "\nExcedent brut d'exploitation (EBE): " + calculEBE() 
		+ "\nDotation aux amortissements: " + dotationAmort +"\nReprise aux amortissements: " + repriseAmort +"\nProduits financiers: " + produitsFinanciers +"\nCharges financieres: " + chargesFinancieres + "\nResultats financiers (RF): " + montantRF 
		+ "\nHors produits HAO: " + montantProduitsHAO +"\nHors charges HAO: " + montantChargesHAO + "\nResultat hors activites ordinaires (RHAO)" + montantRHAO + "\nResultat brut (RB): " + calculRB() + "\nImpots sur les societes (IS): " + calculIS() 
		+ "\nResultat net (RN): " + calculRN() + "\nCapacite auto-financement: " + calculCAF();
	}
}
