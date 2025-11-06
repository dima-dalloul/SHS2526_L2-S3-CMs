package etudiants;

class Promo {
    private Etudiant [] etudiants;

    public Promo(int taille) {
        etudiants = new Etudiant[taille];
        for (int i=0; i<etudiants.length; i++) {
            etudiants[i] = new Etudiant();
        }
    }

    public double moyennePromo() {
        double somme=0;
        for (Etudiant e : etudiants) {
            somme+=e.moyenne();
        }
        return somme/etudiants.length;
    }

    public Etudiant[] getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(Etudiant[] etudiants) {
        this.etudiants = etudiants;
    }

}