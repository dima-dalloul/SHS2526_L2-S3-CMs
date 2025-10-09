package partie1;

public class Point {
    // Attributs - Les coordonnées
    private double x;
    private double y;

    // Constructeurs
    public Point() {
        this(0,0);
    }

    public Point(double abscisse, double ordonnee) {
        x=abscisse;
        y=ordonnee;
    }

    // Méthode 1 : pour calculer l'abcisse
    public double getAbscisse() {
        return x;
    }

    // Méthode 2 : pour calculer l'ordonnée
    public double getOrdonnee() {
        return y;
    }

    // Méthode 3 : retourner les coordonnées sous forme textuelle
    public String toString() {
        return "("+x+", "+y+")";
    }

    // Méthode 4 : je décale mon point de dx et dy
    public void translate(double dx, double dy) {
        x+=dx;
        y+=dy;
    }
}