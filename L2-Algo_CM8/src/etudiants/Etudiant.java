package etudiants;

class Etudiant {
    private int sommeNotes;
    private int nbNotes;

    public void addNote(int note) {
        sommeNotes+=note;
        nbNotes++;
    }
    public double moyenne() {
        if (nbNotes==0) {
            return 0;
        }
        try{
            return ((double) sommeNotes)/nbNotes;
        } catch (Exception e){
            // Si je suis là c'est que j'ai essayé de diviser par 0
            // donc je dois renvoyer tout simplement 0
            return 0;
        }

    }
}