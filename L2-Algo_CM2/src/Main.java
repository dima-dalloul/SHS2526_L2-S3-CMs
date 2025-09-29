//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 1, b = 2, maSuperVariable = 3;
        System.out.println("Hello and welcome les L2!");

        for (int i = 1; i <= 5; i++) {
            String prenom  = "Marin";
            System.out.println(prenom + ", i = " + i);
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
        // Erreur de compilation car variable hors portée: System.out.println(prenom);

        Etudiant e = new Etudiant();
        e.setPrenom("Jane");
        e.setNom("Doe");
        System.out.println(e.getPrenom() + " " + e.getNom());
        String nomEtudiant = e.getNom();
        System.out.println(nomEtudiant);
    }

    // Erreur de compilation car variable hors portée: a = 5;
}