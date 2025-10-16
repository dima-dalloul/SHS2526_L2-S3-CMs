package animaux;

public class Chat extends Felin implements Compagnon {
    public void crier() {
        System.out.println("Miaou");
    }

    public void jouer() {
        System.out.printf("Le chat joue avec une pelote de laine.%n");
    }

    public void faireDesCalins() {
        System.out.printf("Le chat ronronne sur vos genoux.%n");
    }
}