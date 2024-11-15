package missionfusee;

public class FAstronaute extends Fusee {
	private int nombreEquipage;

	public FAstronaute() {
		super();
		System.out.println("Appel du constructeur FAstronaute()");
		this.nombreEquipage = 0;
	}

	public FAstronaute(String nom, double masse, double poussee, double qtcarburant, double consommation,
			double altitude, int nombreEquipage) {
		super(nom, masse, poussee, qtcarburant, consommation, altitude);
		System.out.println(
				"Appel du constructeur FAstronaute(nom, masse, poussee, qtcarburant, consommation, altitude, nombreEquipage)");
		this.nombreEquipage = nombreEquipage;
	}

	public void embarquerEquipage(int nombre) {
		this.nombreEquipage = nombre;
	}

	public int getNombreEquipage() {
		return nombreEquipage;
	}

	public void setNombreEquipage(int nombreEquipage) {
		this.nombreEquipage = nombreEquipage;
	}

	public void afficherCaracteristiques() {
		super.afficherCaracteristiques();
		System.out.println("Nombre d'équipage : " + getNombreEquipage());
	}

	public double decollage() {
		double dureeFonctionnement = getQtcarburant() / getConsommation();
		double masseTotale = getMasse() + (80 * nombreEquipage);
		double altitudeAtteinte = (getPoussee() * dureeFonctionnement * dureeFonctionnement * 100)
				/ (masseTotale + getQtcarburant());
		setAltitude(altitudeAtteinte);
		return altitudeAtteinte;
	}
}