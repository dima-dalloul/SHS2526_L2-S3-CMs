import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*int x = 1;

        // if-else
        if(( x % 2 ) == 0)
            System.out.println("X est pair");
        else
            System.out.println("X est impair");

        // Opérateur ternaire
        String resultatXestPair = (( x % 2 ) == 0) ? "X est pair" : "X est impair";
        System.out.println(resultatXestPair);

        int y = -100;

        if(y < 0){
            System.out.println("y est négatif");
        } else if (y < 10) {
            System.out.println("y est inférieur à 10");
            System.out.println("Hello");
        } else
            System.out.println("y est supérieur à 10");
*/
/*
        // Exemple avec While
        double nombreADevinerWhile = Math.random() * 100;
        int nombreADevinerArrondiWhile = (int) Math.round(nombreADevinerWhile);
        System.out.println("Bienvenue au jeu de la devinette !");
        System.out.println("Essayez de deviner le nombre entre 0 et 100.");
        Scanner scannerWhile = new Scanner(System.in);
        int nombreUtilisateurWhile = scannerWhile.nextInt();
        while (nombreUtilisateurWhile != nombreADevinerArrondiWhile){
            if(nombreUtilisateurWhile < nombreADevinerArrondiWhile){
                System.out.println("Plus grand, essaie encore");
                nombreUtilisateurWhile = scannerWhile.nextInt();
                continue;
                // Toutes les instructions après continue et avant l'accolade ne seront PAS exécutées
                // System.out.println("Test");
            } else{
                System.out.println("Plus petit, essaie encore");
                nombreUtilisateurWhile = scannerWhile.nextInt();
                break;
                // Toutes les instructions après break et avant l'accolade ne seront PAS exécutées
                // System.out.println("Test");
            }
        }

        if(nombreUtilisateurWhile == nombreADevinerArrondiWhile){
            System.out.println("BRAVOO !!! Vous l'avez deviné");
        }

        // Exemple avec le Do-While
        double nombreADevinerDoWhile = Math.random() * 100;
        int nombreADevinerArrondiDoWhile = (int) Math.round(nombreADevinerDoWhile);
        System.out.println("Bienvenue au jeu de la devinette !");
        System.out.println("Essayez de deviner le nombre entre 0 et 100.");
        Scanner scannerDoWhile = new Scanner(System.in);
        int nombreUtilisateurDoWhile;
        do{
            nombreUtilisateurDoWhile = scannerDoWhile.nextInt();
            if(nombreUtilisateurDoWhile < nombreADevinerArrondiDoWhile){
                System.out.println("Plus grand, essaie encore");
            } else{
                System.out.println("Plus petit, essaie encore");
            }
        } while(nombreUtilisateurDoWhile != nombreADevinerArrondiDoWhile);

        if(nombreUtilisateurDoWhile == nombreADevinerArrondiDoWhile){
            System.out.println("BRAVOO !!! Vous l'avez deviné");
        }

        // Exemple for
        for (int i = 0; i < 10 ; i++ ){
            System.out.println(i + " ème itération");
        }

        int j = 0;
        while(j < 10){
            System.out.println(j + " ème itération");
            j++;
        }
        */
     /*   int k = 1;
        switch (k){
            case 0: {
                System.out.println("k est égal à 0");
                break;
            }
            case 1: {
                System.out.println("k est égal à 1");
                break;
            }
            case 2 : {
                System.out.println("k est égal à 2");
                break;
            }
            default:{
                System.out.println("k est égal à " + k);
                break;
            }
        }
                                // indices :  0  1  2  3  4  5  6  7  8  9
        int monTableauEntiers [] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] monTableauDoubles = new double[] {1,1.0,2.1};
        System.out.println("Longueur du tableau : " + monTableauEntiers.length);
        System.out.println("1er élément : " + monTableauEntiers[0]);
        System.out.println("2ème élément : " + monTableauEntiers[1]);
        System.out.println("dernier élément : " + monTableauEntiers[monTableauEntiers.length - 1]);
        // Exception car hors limite
        // System.out.println("dernier élément : " + monTableauEntiers[monTableauEntiers.length]);

        int[] tab= new int[(int) (Math.random()*100)+1];
        for (int i = 0 ; i < tab.length ; i++ ) {
            tab[i]=(int) (Math.random()*1000);
        }
        // Boucle for each
        // Applique tout simplement les instructions sur chaque élément du tableau tab
        for (int element : tab) {
            System.out.println(element);
        }
        // Version de la boucle for each mais avec la boucle for classique
        for (int j = 0; j < tab.length; j++){
            System.out.println(tab[j]);
        }*/

        // Tableau en triangle
        int n = 3;
        int[][] triangle = new int[n][];
        for(int i = 0; i <n ; i++){
            triangle[i] = new int[i+1];
        }

        // Comparaison de tableaux
        String s1 = new String("un");
        String s2 = new String("deux");
        String s3 = new String("trois");
        String[] tab1 = new String[]{s1, s2, s3};
        String[] tab2 = new String[]{s1, s2, s3};
        String[] tab3 = new String[]{new String("un"), new String("deux"), new String("trois")};
        System.out.println("tab1==tab2 ? " + (tab1==tab2)); // idem tab1==tab3 ou tab2==tab3
        System.out.println("tab1.equals(tab2) ? " +  (tab1.equals(tab2))); // dem tab1.equals(tab3) ou tab2.equals(tab3)

        System.out.println("Arrays.equals(tab1,tab2) ? " + Arrays.equals(tab1,tab2));
        System.out.println("Arrays.equals(tab1,tab3) ? " + Arrays.equals(tab1,tab3)); // idem Arrays.equals(tab2,tab3)

        // Remplissage de tableau
        int[] tab = new int[10];
        Arrays.fill(tab, 2, 8, -1);
        System.out.println(Arrays.toString(tab));

        // Copie de tableau
        int[] tabACopier = new int[]{3,5,1,6};
        int[] copie = Arrays.copyOf(tabACopier,2);
        System.out.println(Arrays.toString(copie));
        int[] copie2 = Arrays.copyOfRange(tabACopier,1,3);
        System.out.println(Arrays.toString(copie2));

        // Tri de tableau
        int[] tableauATrier = new int[]{3,5,1,6,2};
        System.out.println(Arrays.toString(tableauATrier));
        Arrays.sort(tableauATrier);
        System.out.println(Arrays.toString(tableauATrier));

        // Recherche dans un tableau
        int idx = Arrays.binarySearch(tableauATrier,6);
        if (idx>-1) {
            System.out.println("6 est dans le tableau à la position "+idx);
        }
        else {
            System.out.println("6 n'est pas dans le tableau");
        }
    }
}