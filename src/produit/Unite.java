package produit;

public enum Unite {
	L("litre"),KG("kilogramme"),CL("centilitre"),ML("mililitre"),P("piece");
	
	private String unite;
	
	private Unite(String unite) {
		this.unite=unite;
	}
	
	public String toString() {
		return unite.toString();
	}
	
}
