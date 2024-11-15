package missionfusee;

public class Fusee {
	private String nom;
	private double masse;
	private double poussee;
	private double qtcarburant;
	private double consommation;
	private double altitude;

	public Fusee() {
		System.out.println("Appel du constructeur Fusee()");
		this.nom = "";
		this.masse = 0.0;
		this.poussee = 0.0;
		this.qtcarburant = 0.0;
		this.consommation = 0.0;
		this.altitude = 0.0;
	}

	public Fusee(String nom, double masse, double poussee, double qtcarburant, double consommation, double altitude) {
		System.out.println("Appel du constructeur Fusee(nom, masse, poussee, qtcarburant, consommation)");
		this.nom = nom;
		this.masse = masse;
		this.poussee = poussee;
		this.qtcarburant = qtcarburant;
		this.consommation = consommation;
		this.altitude = altitude;
	}

	public Fusee(Fusee autreFusee) {
		System.out.println("Appel du constructeur Fusee(Fusee autreFusee)");
		this.nom = autreFusee.nom;
		this.masse = autreFusee.masse;
		this.poussee = autreFusee.poussee;
		this.qtcarburant = autreFusee.qtcarburant;
		this.consommation = autreFusee.consommation;
		this.altitude = autreFusee.altitude;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getMasse() {
		return masse;
	}

	public void setMasse(double masse) {
		this.masse = masse;
	}

	public double getPoussee() {
		return poussee;
	}

	public void setPoussee(double poussee) {
		this.poussee = poussee;
	}

	public double getQtcarburant() {
		return qtcarburant;
	}

	public void setQtcarburant(double qtcarburant) {
		this.qtcarburant = qtcarburant;
	}

	public double getConsommation() {
		return consommation;
	}

	public void setConsommation(double consommation) {
		this.consommation = consommation;
	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	public void afficherCaracteristiques() {
		System.out.println("Nom de la fusée : " + getNom());
		System.out.println("Masse à vide (kg) : " + getMasse());
		System.out.println("Poussée (N) : " + getPoussee());
		System.out.println("Quantité de carburant (L) : " + getQtcarburant());
		System.out.println("Consommation de carburant (L/s) : " + getConsommation());
		System.out.println("Altitude actuelle (m) : " + getAltitude());
	}

	public double decollage() {
		double dureeFonctionnement = qtcarburant / consommation;
		altitude = (poussee * dureeFonctionnement * dureeFonctionnement * 100) / (masse + qtcarburant);
		return altitude;
	}
}
