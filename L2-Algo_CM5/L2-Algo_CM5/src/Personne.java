public class Personne {
    String nom;
    String prenom;
    int age;

    // Constructeurs
    public Personne(){
        this.nom = "Camille";
        this.prenom = "Diane";
        this.age = 23;
    }

    public Personne(String nomDynamique, String prenomDynamique, int ageDynamique){
        this.nom = nomDynamique;
        this.prenom = prenomDynamique;
        this.age = ageDynamique;
    }
}
