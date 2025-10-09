package partie1;

import partie2.Personne;

public class Main {
    public static void main(String[] args) {
        Point3D p3d = new Point3D();
        p3d.getAbscisse();
        p3d.getOrdonnee();
        p3d.getProfondeur();
        System.out.println(p3d.toString());
        // Méthode translate de la classe fille
        p3d.translate(7, 8, 9);
        System.out.println(p3d.toString());
        // Méthode translate de la classe mère
        p3d.translate(7, 8);

        Personne p = new Personne("Lecornu", "Sébastien");
        //p.mangerBU();
    }
}