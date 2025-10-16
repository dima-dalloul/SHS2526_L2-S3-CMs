package gestionDrones;

public class Telecommande {
    private Drone drone;
    public void associer(Drone d) {
        drone=d;
    }
    public void lever(int h) {
        drone.lever(h);
    }
    public void descendre(int h) {
        drone.descendre(h);
    }
    public void tourner(int d){
        drone.tourner(d);
    }
    public void avancer(int v){
        drone.avancer(v);
    }
}