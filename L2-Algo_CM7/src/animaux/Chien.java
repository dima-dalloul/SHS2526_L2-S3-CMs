package animaux;

public class Chien extends Canin implements Compagnon {
    public void crier() {
        System.out.println("Whouaf");
    }

    public void jouer() {
        System.out.printf("Le chien court après sa balle.%n");
    }

    public void faireDesCalins() {
        System.out.printf("Le chien se blottit contre vous.%n");
    }
}