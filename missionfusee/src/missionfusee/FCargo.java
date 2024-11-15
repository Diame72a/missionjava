	package missionfusee;
	
	public class FCargo extends Fusee {
		private double poidsChargement;
		private String typeChargement;
	
		public FCargo() {
			super();
			System.out.println("Appel du constructeur FCargo()");
			this.poidsChargement = 0.0;
			this.typeChargement = "";
		}
	
		public FCargo(String nom, double masse, double poussee, double qtcarburant, double consommation, double altitude,
				double poidsChargement, String typeChargement) {
			super(nom, masse, poussee, qtcarburant, consommation, altitude);
			System.out.println(
					"Appel du constructeur FCargo(nom, masse, poussee, qtcarburant, consommation, altitude, poidsChargement, typeChargement)");
			this.poidsChargement = poidsChargement;
			this.typeChargement = typeChargement;
		}
	
		public void chargerMarchandise(double poids, String type) {
			this.poidsChargement = poids;
			this.typeChargement = type;
		}
	
		public double getPoidsChargement() {
			return poidsChargement;
		}
	
		public void setPoidsChargement(double poidsChargement) {
			this.poidsChargement = poidsChargement;
		}
	
		public String getTypeChargement() {
			return typeChargement;
		}
	
		public void setTypeChargement(String typeChargement) {
			this.typeChargement = typeChargement;
		}
	
		public void afficherCaracteristiques() {
			super.afficherCaracteristiques();
			System.out.println("Poids du chargement : " + getPoidsChargement() + " kg");
			System.out.println("Type de chargement : " + getTypeChargement());
		}
	
		public double decollage() {
			double dureeFonctionnement = getQtcarburant() / getConsommation();
			double masseTotale = getMasse() + poidsChargement;
			double altitudeAtteinte = (getPoussee() * dureeFonctionnement * dureeFonctionnement * 100)
					/ (masseTotale + getQtcarburant());
			setAltitude(altitudeAtteinte);
			return altitudeAtteinte;
		}
	
	}
