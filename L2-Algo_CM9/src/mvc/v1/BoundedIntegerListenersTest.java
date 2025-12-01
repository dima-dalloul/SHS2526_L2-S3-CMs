package mvc.v1;

import java.beans.PropertyChangeListener;

public class BoundedIntegerListenersTest {

    public static void main(String[] args) {
        BoundedInteger bi = new BoundedInteger(5, 0, 10);

        // Listener for only `currentValue` changes
        PropertyChangeListener currentValueListener = evt ->
                System.out.printf("[EVT] %s: %s -> %s%n",
                        evt.getPropertyName(), evt.getOldValue(), evt.getNewValue());
        bi.addPropertyChangeListener(BoundedInteger.PROP_CURRENT_VALUE, currentValueListener);

        // Listener for only `lowerBound` changes
        PropertyChangeListener lowerBoundListener = evt ->
                System.out.printf("[EVT] %s: %s -> %s%n",
                        evt.getPropertyName(), evt.getOldValue(), evt.getNewValue());
        bi.addPropertyChangeListener(BoundedInteger.PROP_LOWER_BOUND, lowerBoundListener);

        System.out.println("=== Start ===");
        System.out.printf("Init -> current=%d, lower=%d, upper=%d%n",
                bi.getCurrentValue(), bi.getLowerBound(), bi.getUpperBound());

        System.out.println("\n-- setValue(7) -> currentValue event");
        bi.setValue(7);

        System.out.println("\n-- setValue(7) again -> no event (no change)");
        bi.setValue(7);

        System.out.println("\n-- decrement() -> currentValue event");
        bi.decrement();

        System.out.println("\n-- setLowerBound(8) -> lowerBound event, then currentValue clamped to 8");
        bi.setLowerBound(8);

        System.out.println("\n-- setLowerBound(8) again -> no event (no change)");
        bi.setLowerBound(8);

        System.out.println("\n-- setUpperBound(7) -> currentValue clamped to 7 (upperBound change not listened)");
        bi.setUpperBound(7);

        System.out.println("\n-- increment() at upper bound -> no event");
        bi.increment();

        System.out.println("\n-- setLowerBound(0) -> lowerBound event; currentValue unchanged");
        bi.setLowerBound(0);

        System.out.println("\n-- decrement() -> currentValue event");
        bi.decrement();

        System.out.println("\n-- Remove currentValue listener, then setValue(3) -> no currentValue print");
        bi.removePropertyChangeListener(BoundedInteger.PROP_CURRENT_VALUE, currentValueListener);
        bi.setValue(3);

        System.out.println("\n=== Done ===");
    }
}
