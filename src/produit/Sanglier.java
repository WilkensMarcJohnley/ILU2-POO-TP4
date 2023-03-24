package produit;

import personnages.Gaulois;

public class Sanglier extends Produit{
	private int poids;
	private Gaulois gaulois;
	
	public Sanglier(int poids, Gaulois gaulois) {
		super("Sanglier", Unite.KG);
		this.poids = poids;
		this.gaulois = gaulois;
	}
	
	public String descriptionProduit() {
		String texte;
		texte= super.getNom()+" de "+ poids+ " kg chassé par "+gaulois; 
		return texte;
	}
}
