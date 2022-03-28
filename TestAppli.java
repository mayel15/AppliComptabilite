package appli;

/**Classe Entreprise
 * 
 * @author mayel
 *
 */

public class TestAppli {

	public static void main(String[] args) {
		Entreprise e1, e2, e3;
		e1 = new Entreprise("Quincaillerie Ndiaye et Freres", 772547688);
		e2 = new Entreprise("Alimentation Generale HLM1", 775147621);
		e3 = new Entreprise("AtraSchool", 772899074);
		
		Client c1, c2;
		c1 = new Client("Abdoulaye SARRE");
		c2 = new Client("Simon DIOUF");
		
		Produit p1, p2, p3, p4, p5, p6, p7, p8;
		p1 = new Produit("Sac de ciment", 2, 5000);
		p2 = new Produit("Marteau", 1, 2000);
		p3 = new Produit("Tourne à vis", 3, 1000, "01/01/2022", "Especes", e2.getNom());
		p4 = new Produit("Fer", 5, 1500, "01/02/2022", "Virement", e1.getNom());
		p5 = new Produit("Brique", 50, 800, "01/03/2022", "Cheques", c1.getNom());
		p6 = new Produit("Tourne à vis", 3, 1000, "01/04/2022", "Especes", e3.getNom());
		p7 = new Produit("Beton", 10, 5100);
		p8 = new Produit("Ciment platre", 4, 2100);
		
		Facture f1, f2;
		f1 = new Facture(e1, c1, "04/05/2022");
		f1.addProduit(p1);
		f1.addProduit(p2);
		f2 = new Facture(e1, c2, "14/05/2022");
		f2.addProduit(p7);
		f2.addProduit(p8);
		
		Ventes v1;
		v1 = new Ventes();
		v1.addVentes(p3);
		v1.addVentes(p4);
		v1.addProdFacture(f2);
		v1.addProdFacture(f2);
		
		Depenses d1;
		d1 = new Depenses();
		d1.addDepenses(p5);
		d1.addDepenses(p6);
		
		EFinancier ef = new EFinancier(v1, d1, 1200000, 500000, 20000, 25000, 10000, 175000, 9500, 30000, 40000, 35000, 8500, 7000);
		
		//Affichage factures
		System.out.println("------- Facture ------");
		System.out.println(f1);
		int j;
		for(j=0;j<f1.produits.size();j++) {
			System.out.println(f1.produits.get(j));
		}
		System.out.println("\nTOTAL HT: " + f1.calculTotHT() + "\nTVA: " + f1.calculTVA() + "\nTOTAL TTC: " + f1.calculTotTTC());
		System.out.println("------- Facture ------");
		System.out.println(f2);
		for(j=0;j<f2.produits.size();j++) {
			System.out.println(f2.produits.get(j));
		}
		System.out.println("\nTOTAL HT: " + f2.calculTotHT() + "\nTVA: " + f2.calculTVA() + "\nTOTAL TTC: " + f2.calculTotTTC());

		//Affichage details ventes
		System.out.println("------- Details ventes ------");
		int i;
		for(i=0;i<v1.ventes.size();i++) {
			System.out.println(v1.ventes.get(i));
		}
		
		//Affichage details depenses
		System.out.println("------- Details depenses ------");
		for(i=0;i<d1.depenses.size();i++) {
			System.out.println(d1.depenses.get(i));
		}
		
		//Affichage etats financiers
		System.out.println("------- Etats Financiers ------");
		System.out.println(ef);
		
		
	}

}
