package geometrie;

public class Rectangle extends Forme {
    private int largeur = 10;
    private int hauteur = 15;
    public double aire() {
        System.out.println("Aire de rectangle = " + largeur * hauteur);
        return largeur * hauteur;
    }
}