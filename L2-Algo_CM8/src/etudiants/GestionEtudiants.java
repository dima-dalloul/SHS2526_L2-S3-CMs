package etudiants;

public class GestionEtudiants {
    public static void main (String[] args){
        Etudiant e1 = new Etudiant();
        Etudiant e2 = new Etudiant();

        e1.addNote(18);
        e1.addNote(17);
        e1.addNote(3);

        System.out.println("Moyenne des notes e1 : " + e1.moyenne());
        System.out.println("Moyenne des notes e2 : " + e2.moyenne());

        Promo promo2025 = new Promo(3);
        promo2025.getEtudiants()[0].addNote(15);
        promo2025.getEtudiants()[0].addNote(14);
        promo2025.getEtudiants()[1].addNote(12);
        promo2025.getEtudiants()[2].addNote(10);
        promo2025.getEtudiants()[2].addNote(16);
        System.out.println("Moyenne de la promo 2025 : " + promo2025.moyennePromo());

        Promo promoVide = new Promo(0);
        System.out.println("Moyenne de la promo Vide : " + promoVide.moyennePromo());
    }
}
