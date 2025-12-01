package mvc.v1;
import java.beans.PropertyChangeListener;

public class BoundedIntegerListenersDemo {

    public static void main(String[] args) {
        BoundedInteger bi = new BoundedInteger(5, 0, 10);

        // Listener notified only for `currentValue` changes
        PropertyChangeListener currentValueListener = evt ->
                System.out.printf("currentValue: %s -> %s%n", evt.getOldValue(), evt.getNewValue());
        bi.addPropertyChangeListener(BoundedInteger.PROP_CURRENT_VALUE, currentValueListener);

        // Listener notified only for `lowerBound` changes
        PropertyChangeListener lowerBoundListener = evt ->
                System.out.printf("lowerBound: %s -> %s%n", evt.getOldValue(), evt.getNewValue());
        bi.addPropertyChangeListener(BoundedInteger.PROP_LOWER_BOUND, lowerBoundListener);

        // Simple triggers (optional)
        bi.setValue(7);        // notifies currentValueListener
        bi.setLowerBound(3);   // notifies lowerBoundListener
        bi.decrement();        // may notify currentValueListener if value changes
    }
}
