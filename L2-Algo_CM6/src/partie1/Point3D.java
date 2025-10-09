package partie1;

public class Point3D extends Point {
    // Attribut - coordonnée sur l'axe Z
    private double z;

    // Constructeurs
    public Point3D() {
        this(0,0,0);
    }
    public Point3D(double abs, double ord, double prof) {
        super(abs, ord);
        z = prof;
    }

    // Méthode : pour calculer la profondeur
    public double getProfondeur() {
        return z;
    }

    // Méthode 2 : retourner les coordonnées sous forme textuelle
    public String toString() {
        return "(" + getAbscisse() + ", " + getOrdonnee() + ", " + z + ")";
    }

    // Méthode 3 : je décale mon point de dx, dy et dz
    public void translate(double dx, double dy, double dz) {
        translate(dx, dy);
        z += dz;
    }
}