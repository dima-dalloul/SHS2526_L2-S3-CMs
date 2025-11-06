package gestionPersonnes;

public class Personne {
    private String prenom;
    private String nom;
    private int age;

    public Personne(String p , String n, int a) {
        nom=n;
        prenom=p;
        // V1
        if(a > 0){
            throw new RuntimeException();
        } else {
            age=a;
        }
    }

    public void setAge(int a) {
        // V2
        if(a > 0){
            throw new RuntimeException();
        } else {
            age=a;
        }
    }

    public String toString() {
        return "Je m'apelle "+nom+" "+prenom+" et j'ai "+age+" ans";
    }
}