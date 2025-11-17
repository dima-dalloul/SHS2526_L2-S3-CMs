package mvc.v1;

import java.util.Observable;
import java.util.Observer;

public class BasicBIObserver implements Observer {
    private BoundedInteger observedModel;
    private String name;

    public BasicBIObserver() {
        this(null,"");
    }

    public BasicBIObserver(BoundedInteger model, String name) {
        this.observedModel=model;
        this.name=name;
        model.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object evt) {
        if (obs.equals(observedModel)) {
            System.out.println("I am observer "+name+". I have been notified of these changes: ");
            System.out.println("\tlower bound"+observedModel.getLowerBound());
            System.out.println("\tcurrent value"+observedModel.getCurrentValue());
            System.out.println("\tupper bound"+observedModel.getUpperBound());
        }
    }
}