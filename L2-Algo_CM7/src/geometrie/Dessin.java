package geometrie;

public class Dessin {
    private static Forme[] formes;
    public static double aireTotale() {
        double total=0;
        formes = new Forme[2];
        formes[0] = new Rectangle();
        formes[1] = new Cercle();
        for (Forme f : formes) {
            total+=f.aire();
            f.afficheForme();
        }
        return total;
    }

    public static void main(String[] args){
        System.out.println(aireTotale());
    }
}
