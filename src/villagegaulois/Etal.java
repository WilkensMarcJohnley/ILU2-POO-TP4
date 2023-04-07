package villagegaulois;

import personnages.Gaulois;

public class Etal<P extends IProduit> implements IEtal {
	private Gaulois vendeur;
	private P[] tabProduit;
	private int nbProduit;
	private int prixProduit;
	
	public Etal(Gaulois vendeur, P[] tabProduit, int nbProduit, int prixProduit) {
		this.vendeur = vendeur;
		this.tabProduit = tabProduit;
		this.nbProduit = nbProduit;
		this.prixProduit = prixProduit;
	}
	
	public Etal installerVendeur(Gaulois vendeur, P[] produit, int prix) {
		this.vendeur=vendeur;
		this.tabProduit=produit;
		this.nbProduit=tabProduit.length;
		this.prixProduit=prix;
		
	}
	
	

	@Override
	public Gaulois getVendeur() {
		// TODO Auto-generated method stub
		return vendeur;
	}
	
	@Override
	public double donnerPrix() {
		return prixProduit;
	}
	
	@Override
	public int contientProduit(String produit, int quantiteSouhaitee) {
		return 1;
	}
	@Override
	public double acheterProduit(int quantiteSouhaitee) {
		return 0;
	}
	
	@Override
	public String etatEtal() {
		return null;
	}
	
	
}
