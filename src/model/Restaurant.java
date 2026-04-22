package model;

class Restaurant {
    private int[] tables = new int[100]; // taille max (au choix)
    private int nbTables = 0;

    public void ajouterTable(int nbPlaces) {
        tables[nbTables] = nbPlaces;
        nbTables++;
    }

    public int[] donnerPossibilites(FormulaireRestaurant formulaire) {
        int[] res = new int[nbTables];

        int nb = formulaire.getNombrePersonnes();

        for (int i = 0; i < nbTables; i++) {
            if (tables[i] == nb || tables[i] == nb + 1) {
                res[i] = i + 1;
            } else {
                res[i] = 0;
            }
        }

        return res;
    }

    public Reservation reserver(int numTable, FormulaireRestaurant formulaire) {
        return new ReservationRestaurant(
                formulaire.getJour(),
                formulaire.getMois(),
                formulaire.getNumService(),
                numTable
        );
    }
}