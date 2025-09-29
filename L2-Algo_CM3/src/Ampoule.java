public class Ampoule {
    boolean allumee;
    int intensite;

    /**
     * Méthode pour indiquer si l'ampoule est allumée à pleine puissance
     * @return true si elle l'est
     */
    boolean allumeeAPleinePuissance() {
        System.out.println("allumeeAPleinePuissance ? ");
        return allumee && intensite==100;
    }
}
