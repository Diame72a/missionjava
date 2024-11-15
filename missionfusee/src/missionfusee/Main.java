package missionfusee;

public class Main {

	public static void main(String[] args) {

// exercice 1	

		System.out.println("Exercice 1 : ");

		System.out.println("");

		Fusee saturnV = new Fusee();

		saturnV.setNom("SATURN V");
		saturnV.setMasse(3000000);
		saturnV.setPoussee(35000000);
		saturnV.setQtcarburant(2030000);
		saturnV.setConsommation(13000);
		saturnV.setAltitude(0.0);

		System.out.println("Caractéristiques de la fusée SATURN V avant décollage :");
		System.out.println("Nom de la fusée : " + saturnV.getNom());
		System.out.println("Masse à vide (kg) : " + saturnV.getMasse());
		System.out.println("Poussée (N) : " + saturnV.getPoussee());
		System.out.println("Quantité de carburant (L) : " + saturnV.getQtcarburant());
		System.out.println("Consommation de carburant (L/s) : " + saturnV.getConsommation());
		System.out.println("Altitude actuelle (m) : " + saturnV.getAltitude());

		double altitudeAtteinte1 = saturnV.decollage();
		System.out.println("\nDécollage de la fusée " + saturnV.getNom());
		System.out.println("");
		System.out.println("Altitude atteinte après décollage : " + altitudeAtteinte1 + " mètres");
		System.out.println("");

		// exercice 2

		System.out.println("Exercice 2 : ");

		System.out.println("");

		Fusee saturnVV = new Fusee("SATURN V", 3000000.00, 35000000.00, 2030000.00, 13000.00, 0.00);

		System.out.println("Ex 2 : Caractéristique de la fusée au décollage :");
		saturnVV.afficherCaracteristiques();

		double altitudeAtteinte = saturnVV.decollage();
		System.out.println("Ex 2 : Décollage de la fusée : " + saturnVV.getNom());
		System.out.println("");
		System.out.println("Ex 2 : Altitude atteinte après le decollage : " + altitudeAtteinte + " mètres");

		System.out.println("");

		Fusee saturnV2 = new Fusee(saturnV);

		System.out.println("Ex 2 : Caractéristiques de la fusée SATURN V2 :");
		System.out.println("");
		saturnV2.afficherCaracteristiques();
		System.out.println("");

		// exercice 3

		System.out.println("Exercice 3 :");

		System.out.println("");

		FAstronaute fusee3 = new FAstronaute("SATURN V", 3000000.0, 35000000.0, 20300000.0, 13000.0, 0.0, 3);
		double altitudeAtteinte3 = fusee3.decollage();
		System.out.println("Ex 3 : Caractéristique de la fusée :");
		System.out.println("");
		fusee3.afficherCaracteristiques();
		System.out.println("");
		System.out.println("Ex 3 : Altitude atteinte après décollage : " + altitudeAtteinte3 + " mètres");

		System.out.println("");

		FCargo fusee4 = new FCargo("SATURN V2", 3000000.0, 35000000.0, 2030000.0, 13000.0, 0.0, 3000, "Satellite");
		double altitudeAtteinte4 = fusee4.decollage();
		System.out.println("Ex 3 : Caractéristique de la fusée :");
		System.out.println("");
		fusee4.afficherCaracteristiques();
		System.out.println("");
		System.out.println("Ex 3 : Altitude atteinte après décollage : " + altitudeAtteinte4 + " mètres");
		System.out.println("");
		
		// Exercice 6 :
		
		System.out.println("Exercice 6 : ");
		
		System.out.println("");
		
		FAstronaute fuseeAstronaute = new FAstronaute("Astronaute V1", 2500000, 30000000, 1500000, 10000, 0, 3);
        System.out.println("Caractéristiques de la fusée FAstronaute avant décollage :");
        System.out.println("");
        fuseeAstronaute.afficherCaracteristiques();
        double altitudeAstronaute = fuseeAstronaute.decollage();
        System.out.println("");
        System.out.println("Altitude atteinte après décollage de la fusée FAstronaute : " + fuseeAstronaute.getAltitude() + " mètres");
        System.out.println("");

        FCargo fuseeCargo = new FCargo("Cargo V1", 2500000, 30000000, 1500000, 10000, 0, 5000, "Satellite");
        System.out.println("Caractéristiques de la fusée FCargo avant décollage :");
        System.out.println("");
        fuseeCargo.afficherCaracteristiques();
        double altitudeCargo = fuseeCargo.decollage();
        System.out.println("");
        System.out.println("Altitude atteinte après décollage de la fusée FCargo : " + fuseeCargo.getAltitude() + " mètres");
        System.out.println("");
        
        // Exercice 7 : 
        
        System.out.println("Exercice 7 :");
        
        System.out.println("");
        
        Fusee[] hangar = new Fusee[10];

        hangar[0] = new FCargo("Cargo V1", 2500000, 30000000, 1500000, 10000, 0, 5000, "Satellite");
        hangar[1] = new FCargo("Cargo V2", 2600000, 31000000, 1600000, 11000, 0, 5500, "Marchandises");
        hangar[2] = new FCargo("Cargo V3", 2700000, 32000000, 1700000, 12000, 0, 6000, "Nourriture");
        hangar[3] = new FCargo("Cargo V4", 2800000, 33000000, 1800000, 13000, 0, 6500, "Instruments");
        hangar[4] = new FCargo("Cargo V5", 2900000, 34000000, 1900000, 14000, 0, 7000, "Véhicules");

        hangar[5] = new FAstronaute("Astronaute V1", 2500000, 30000000, 1500000, 10000, 0, 3);
        hangar[6] = new FAstronaute("Astronaute V2", 2600000, 31000000, 1600000, 11000, 0, 4);
        hangar[7] = new FAstronaute("Astronaute V3", 2700000, 32000000, 1700000, 12000, 0, 5);
        hangar[8] = new FAstronaute("Astronaute V4", 2800000, 33000000, 1800000, 13000, 0, 6);
        hangar[9] = new FAstronaute("Astronaute V5", 2900000, 34000000, 1900000, 14000, 0, 7);

        for (int i = 0; i < hangar.length; i++) {
            System.out.println("Décollage de la fusée " + hangar[i].getNom() + " :");
            System.out.println("");
            double altitude = hangar[i].decollage();
            System.out.println("Altitude atteinte après décollage : " + altitude + " mètres\n");
        }
        
    }
		
	}

