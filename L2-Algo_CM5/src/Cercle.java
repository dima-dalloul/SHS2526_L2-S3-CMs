class Cercle {
    Point centre;
    int rayon;

    // Constructeurs
    Cercle() {
        centre=new Point(0,0);
        rayon=1;
    }
    Cercle(int r) {
        centre=new Point(0,0);
        rayon=r;
    }
    Cercle(Point c) {
        centre=c;
        rayon=1;
    }
    Cercle(Point c, int r) {
        centre=c;
        rayon=r;
    }


    // Calcul de l'aire
    double aire() {
        return Math.PI*rayon*rayon;
    }
}