public class DictionnaireStringInt {
    private String[] cles = new String[10];
    private int[] valeurs = new int[10];
    private int nbElements = 0;

    public void ajouterModifier(String cle, int valeur) {
        System.out.println("ajouterModifier(" + cle + ", " + valeur + ")");
    }

    public int rechercherValeur(String cle) {
        System.out.println("rechercherValeur(" + cle + ")");
        return -1; // par défaut car je ne vais pas remplir ces méthodes maintenant
    }

    public int rechercherIdx(String cle) {
        System.out.println("rechercherIdx(" + cle + ")");
        return -1; // par défaut car je ne vais pas remplir ces méthodes maintenant
    }

    public void agrandir() {
        System.out.println("agrandir");
    }

    public int supprimer(String cle) {
        System.out.println("supprimer(" + cle + ")");
        return -1; // par défaut car je ne vais pas remplir ces méthodes maintenant
    }

    public String toString() {
        System.out.println("toString(");
        return ""; // par défaut car je ne vais pas remplir ces méthodes maintenant
    }

    public int getNbElements() {
        System.out.println("getNbElements(");
        return -1; // par défaut car je ne vais pas remplir ces méthodes maintenant
    }
}