package partie2;

public class Etudiante extends Personne{
    private double motivation;

    public Etudiante(String nomN, String prenomP, double motivationM){
        super(nomN, prenomP);
        motivation = motivationM;
    }

    public String toString(){
        return super.toString() + " . Elle est motivée comme ça : " + motivation;
    }

    public void manger(){
        System.out.println(super.mangerBU());
    }
}
