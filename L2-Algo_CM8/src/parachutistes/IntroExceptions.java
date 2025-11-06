package parachutistes;

public class IntroExceptions {
    public static void main(String[] args) {
        Parapentiste casseCou = new Parapentiste();
        Parapentiste inconscient = new Parapentiste();
        Parapentiste prevoyant = new Parapentiste();

        Parapentiste[] participants = new Parapentiste[] {prevoyant,casseCou,inconscient};

        CoupeIcare c = new CoupeIcare();
        try{
            c.parade(participants);
            // voter pour le gagnant
            System.out.println("Le gagnant est ...");
        } catch (RuntimeException e) {
            System.err.println("Il faut appeler les secours !!!");
        }
    }
}