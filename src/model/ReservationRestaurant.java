package model;

public class ReservationRestaurant extends Reservation {
	private int numService; 
	private int numTable; 

	public ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		super(mois,jour);
		this.numService=numService;
		this.numTable=numTable;
	}

	public int getNumService() {
		return numService;
	}

	public int getNumTable() {
		return numTable;
	}

	
	  @Override
	    public String toString() {
	        String service;

	        if (numService == 1) {
	            service = "premier service";
	        } else {
	            service = "deuxieme service";
	        }

	        return "Le " + jour + "/" + mois + "\n" +
	               "Table " + numTable + " pour le " + service + ".";
	    }

	  @Override
	  public void afficherDetails() {
		// TODO Auto-generated method stub
		
	  }

}
