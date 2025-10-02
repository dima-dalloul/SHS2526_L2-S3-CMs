
import packagePoint.Point;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Personne personne = new Personne("AA", "BB", 20, new Personne());
        Point p = new Point();
        Cercle cercle = new Cercle();
        System.out.println("Aire du cercle = " + cercle.aire());

        //point.affichePoint();

    }
}