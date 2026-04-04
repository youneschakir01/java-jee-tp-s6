package TP3;

public class TestParking {

	public static void main(String[] args) {
		Vehicule[] v = new Vehicule[4];
		v[0] = new Voiture(" C25 "," BMW ", 4);
		v[1] = new Voiture(" B11 "," Dacia ", 4);
		v[2] = new Moto(" H20 "," YAMAHA ", true);
		v[3] = new Camion(" D05 "," MAN ", 10.5);
		for (Vehicule veh : v) {
			veh.stationner();
			veh.afficher();
		}
		System.out.println("\nLes voitures : ");
		for (Vehicule veh : v) {
			if (veh instanceof Voiture) {
				veh.stationner();
				veh.afficher();
			
			}
		}
		Vehicule x = new Moto("11C22", "Yamaha", true);
				 
		
		Moto v1 = (Moto) x;
		System.out.println("Downcasting reussi !");
		
	}

}

