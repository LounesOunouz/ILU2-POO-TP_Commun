package model;

public abstract class  Reservation {
	protected int mois  ;
	protected int jour;
	public Reservation(int mois2, int jour2) {
		super();
		this.mois = mois2;
		this.jour = jour2;
	} 
public abstract void afficherDetails();
}
