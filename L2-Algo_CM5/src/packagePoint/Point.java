package packagePoint;

public class Point {
    private double coordX = 0.6;
    private double coordY = 0.0;

    // Constructeur
    public Point(){
        //this(0.5, 0.9);
        coordX  = 0.5;
        coordY = 0.9;
    }

    public Point(double coordX, double coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    protected void affichePoint(){
        System.out.println("Coordonnées du point : (" + coordX + ", " + coordY + ")");
    }
}
