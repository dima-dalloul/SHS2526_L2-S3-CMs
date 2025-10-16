package gestionDrones;

public class DroneAvecGPS extends Drone {
    private double gps;

    public void allerVers(double coordonnee) {
        System.out.println("Le drone avec GPS va vers la coordonnee " + coordonnee);
    }
}
