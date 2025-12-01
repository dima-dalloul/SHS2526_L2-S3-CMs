package geometrie;

public class Cercle extends Forme {
    private int rayon = 5;

    @Override
    public double aire() {
        System.out.println("Aire de cercle = " + Math.PI*rayon*rayon);
        return Math.PI*rayon*rayon;
    }
}
