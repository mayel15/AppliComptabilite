# AppliComptabilite

Cas d’utilisation : 
-Faire un devis/ Facture
-Enregistrer ventes et dépenses 
-Calcul impôts et taxes
-Faire rapports mensuels des ventes et dépenses
-Sauvegarde de pièces comptables
-Plan comptable
-Connection avec OMoney, Wave , Aide App
Classes : 
-Entreprise : Attributs ( nom, adresse, code postale, Telephone,  Email, Type{StartUp, TPE, PME etc..) ; Méthodes (toString , getteur et setteur)
-Client : Attributs(Nom, numéro client, Email)
-Produit : Attributs (Lilbelle, Quantité, Prix Unitaire, , date , type virement,  beneficiare (nomClient/Boutique/Fournisseur ) ; +sieurs Constructeurs !=  ; Méthodes (Getteur et setteur  de chaque attributs, montant )
-Facture : Attributs (Entreprise, Client ,numéro facture, produit type array list ) ; Méthodes (Getteurs et Setteurs des attibuts, calcul tva, calcul de Tot Ht, calcul tot ttc  ) 
-Ventes : Attributs (produit ou vente de type arraylist) ; 1 constructeur ; Méthodes (Calcul totalventes ) 
-Depenses : Attributs ( produit ou depense de type arraylist) ; 1 constructeur ; Méthodes (Calcul Tot, toString)

A revoir : / -Etats Financiers : Méthodes (Marge commerciale, Chiffres d’affaires, Valeur ajoutées, EBN, … )
La formule correspond à : Calcul EBE = CA (HT) – achats de marchandises (montant HT) – charges externes (montant HT) – impôts et taxes – coût de la masse salariale (salaires et charges sociales) + subventions d'exploitation.
