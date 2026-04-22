package model;

public class FormulaireRestaurant {
	private int Jour;
	private int Mois; 
	private int NombrePersonnes;
	private int NumService; 
	private int IdentificationEntite;
	

	public FormulaireRestaurant(int jour, int mois, int nombrePersonnes, int numService) {
//		super();
		Jour = jour;
		Mois = mois;
		NombrePersonnes = nombrePersonnes;
		NumService = numService;
	}


	public int getIdentificationEntite() {
		return IdentificationEntite;
	}


	public void setIdentificationEntite(int identificationEntite) {
		IdentificationEntite = identificationEntite;
	}


	public int getNombrePersonnes() {
		return NombrePersonnes;
	}


	public int getNumService() {
		return NumService;
	}


	public int getJour() {
		return Jour;
	}


	public int getMois() {
		return Mois;
	}


	

}
