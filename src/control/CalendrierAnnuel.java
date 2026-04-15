package control;

public class CalendrierAnnuel {
	private Mois[] calendrier = new Mois[12];

	private static class Mois {
		private String nom;
		private boolean[] jours;

		public Mois(String nom, int nbjours) {
			this.nom = nom;
			this.jours = new boolean[nbjours];
			for (int i = 0; i < nbjours; i++) {
				this.jours[i] = false;
			}
		}

		private boolean estLibre(int day) {
			return !jours[day - 1];
		}

		private void reserver(int day) {
			if (estLibre(day)) {
				jours[day - 1] = true;
			} else {
				throw new IllegalStateException("excep");
			}
		}

	}

	public CalendrierAnnuel() {

		this.calendrier[0] = new Mois("Janvier", 31);
		this.calendrier[1] = new Mois("Fevrier", 28);
		this.calendrier[2] = new Mois("Mars", 31);
		this.calendrier[3] = new Mois("Avril", 30);
		this.calendrier[4] = new Mois("Mai", 31);
		this.calendrier[5] = new Mois("Juin", 30);
		this.calendrier[6] = new Mois("Juillet", 31);
		this.calendrier[7] = new Mois("Aout", 31);
		this.calendrier[8] = new Mois("Septembre", 30);
		this.calendrier[9] = new Mois("Octobre", 31);
		this.calendrier[10] = new Mois("Novembre", 30);
		this.calendrier[11] = new Mois("Decembre", 31);

	}

	public boolean estLibre(int jour, int mois) {

		return calendrier[mois - 1].estLibre(jour);
	}

	public boolean reserver(int jour, int mois) {
		if (estLibre(jour, mois)) {
			calendrier[mois - 1].reserver(jour);
			return true;

		} else {
			return false;
		}
	}

}
