package gestionDrones;

public class DesDrones {
    public static void main(String[] args) {
        Telecommande t = new Telecommande();
        DroneAvecGPS d = new DroneAvecGPS();
        t.associer(d);
        t.lever(10);
    }
}