import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /**
     * Ceci est une méthode pour lancer mon projet
     * @param args - les paramètres que j'attends
     * @return je ne renvoie rien
     */
    public static void main(String[] args) {
        /* Je
        suis
        un
        long
        commentaire
         */
        int var1 = 0;
        var1 = 4;

        final int var2 = 2;
        //var2 = 5;
        System.out.println("Coucou les L2");
        System.err.println("petite erreur pour le fun");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);

        Ampoule a = new Ampoule();
        a.allumee = true;
        a.intensite = 50;

        Ampoule b = a;
        b.intensite = 30;

        System.out.println("Intensité de A : " + a.intensite);

        int x = 100;
        System.out.println("x= " + x);
        System.out.println(x+=100);
        System.out.println(x-=10);
        System.out.println(x*=5);
        System.out.println(x/=2);
        System.out.println(x%=6);

        String mot1 = new String("Jared");
        String mot2 = new String("Jared");
        System.out.println(mot1 == mot2);
        System.out.println(mot1.equals(mot2));

        // Exemple d'opérateur logique
        Ampoule a1 = new Ampoule();
        Ampoule a2 = new Ampoule();

        a1.allumee=true;
        a2.allumee=true;
        a2.intensite=100;

        boolean resultatET = a1.allumeeAPleinePuissance() && a2.allumeeAPleinePuissance();
        boolean resultatOU = a1.allumeeAPleinePuissance() || a2.allumeeAPleinePuissance();
        System.out.println("Résultat ET : " + resultatET);
        System.out.println("Résultat OU : " + resultatOU);

        System.out.println("Opérateurs de concaténation");
        System.out.println(1+13);
        System.out.println("1"+13);
        System.out.println("1+"+13);

    }
}