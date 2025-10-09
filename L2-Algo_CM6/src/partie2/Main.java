package partie2;

public class Main {
    public static void main(String[] args){
        Personne p = new Personne("Doe", "Jane");

        Etudiante e = new Etudiante("Fontaine", "Lucy", 0.5);

        System.out.println(p.toString());

        System.out.println(e.toString());
    }
}
