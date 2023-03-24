package produit;

public class Poisson extends Produit {
	private String date;

	public Poisson(String date) {
		super("Poisson",Unite.P);
		this.date = date;
	}
	
	public String descriptionProduit() {
		String texte;
		texte=super.getNom()+" péchés "+ date;
		return texte;
	}
	
	
}
