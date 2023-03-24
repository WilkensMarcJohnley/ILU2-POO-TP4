package scenarioTest;

import personnages.Gaulois;
import produit.Poisson;
import produit.Sanglier;
import villagegauloisold.Etal;
import villagegauloisold.IEtal;

public class ScenarioTest {
	public static void main(String[] args) {
		IEtal[] marche = new IEtal[3];
		Etal<Sanglier> etalSanglier = new Etal<>();
		Etal<Poisson> etalPoisson = new Etal<>();
		marche[0] = etalSanglier;
		//marche[1] = etalPoisson;
		marche[0].occuperEtal(new Gaulois("Ordralfabétix", 12), new Poisson("lundi"), 10);
	}
	
}
