package mvc.v1;

import java.util.Observable;
import java.util.Observer;

public class ObserverCurrentValueChange extends BasicBIObserver implements Observer {
    private BoundedInteger observedModel;

    public ObserverCurrentValueChange(BoundedInteger model) {
        super();
        this.observedModel=model;
        model.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if ( o.equals(observedModel) &&
                arg == MyEvents.CURRENT_VALUE_CHANGE) {
            System.out.println("Current value changed to: " + observedModel.getCurrentValue());
        }
    }
}