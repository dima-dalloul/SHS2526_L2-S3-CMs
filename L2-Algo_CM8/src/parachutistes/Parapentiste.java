package parachutistes;

public class Parapentiste {
    private Parachute parachute;

    public void acheterUnParachute(Parachute p) {
        parachute=p;
    }

    public void sauter() {
        if (parachute==null) {
            throw new RuntimeException("Aie !!!");
        }
        parachute.ouvrir();
    }
}