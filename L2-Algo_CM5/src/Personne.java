public class Personne {
    private String nom;
    private String prenom;
    private int age;
    private Personne conjoint;

    // Constructeurs
    public Personne(){
        this.nom = "Camille";
        this.prenom = "Diane";
        this.age = 23;
        this.conjoint = new Personne("Doe", "Jules", 30, this);
    }

    public Personne(String nomDynamique, String prenomDynamique, int ageDynamique, Personne conjointDynamique){
        this.nom = nomDynamique;
        this.prenom = prenomDynamique;
        this.age = ageDynamique;
        this.conjoint = conjointDynamique;
    }

    public String getNom(){
        return this.nom;
    }

    public String getPrenom(){
        return this.prenom;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int newAge){
        if(newAge >= 0){
            this.age = newAge;
        }
    }

    public boolean AMemeConjoint(Personne p){
        if((this.conjoint.getNom() == p.getNom()) && (this.conjoint.getPrenom() == p.getPrenom()) && (this.conjoint.age == p.age)){
            return true;
        } else {
            return false;
        }
    }
}
