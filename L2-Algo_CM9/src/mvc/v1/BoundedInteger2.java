package mvc.v1;

import java.util.Observable;
import java.util.Observer;

public class BoundedInteger2 extends AnotherClass {
    private final Observable obs = new Observable();
    public void addObserver(Observer o) {
        obs.addObserver(o);
    }
    public void deleteObserver(Observer o) {
        obs.deleteObserver(o);
    }
}