package partie2;

public class Personne {
    private String nom, prenom;

    public Personne(String nomN, String prenomP){
        nom = nomN;
        prenom = prenomP;
    }

    public String toString(){
        return "La personne est " + nom + " " + prenom;
    }

    protected String mangerBU(){
        return "Je mange à la BU";
    }
}
