package gestionDrones;

public class Drone {
    public void lever(int h) {
        System.out.println("Le drone se lève");
    }

    public void descendre(int h) {
        System.out.println("Le drone descend");
    }

    public void tourner(int d){
        System.out.println("Le drone tourne");
    }

    public void avancer(int v){
        System.out.println("Le drone avance");
    }
}