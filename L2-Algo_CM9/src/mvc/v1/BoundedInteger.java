// java
package mvc.v1;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class BoundedInteger {

    public static final String PROP_CURRENT_VALUE = "currentValue";
    public static final String PROP_LOWER_BOUND = "lowerBound";
    public static final String PROP_UPPER_BOUND = "upperBound";

    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    private int lowerBound;
    private int upperBound;
    private int currentValue;

    public BoundedInteger(int currentVal, int min, int max) {
        lowerBound = min;
        upperBound = max;
        currentValue = clamp(currentVal, lowerBound, upperBound);
    }

    public int increment() {
        int old = currentValue;
        if (currentValue < upperBound) {
            currentValue++;
            pcs.firePropertyChange(PROP_CURRENT_VALUE, old, currentValue);
        }
        return currentValue;
    }

    public int decrement() {
        int old = currentValue;
        if (currentValue > lowerBound) {
            currentValue--;
            pcs.firePropertyChange(PROP_CURRENT_VALUE, old, currentValue);
        }
        return currentValue;
    }

    public void setValue(int newVal) {
        int clamped = clamp(newVal, lowerBound, upperBound);
        int old = currentValue;
        if (old != clamped) {
            currentValue = clamped;
            pcs.firePropertyChange(PROP_CURRENT_VALUE, old, currentValue);
        }
    }

    public void setUpperBound(int newMax) {
        int oldUpper = upperBound;
        if (oldUpper != newMax) {
            upperBound = newMax;
            pcs.firePropertyChange(PROP_UPPER_BOUND, oldUpper, upperBound);
        }
        // Clamp current value if needed and notify
        if (currentValue > upperBound) {
            int old = currentValue;
            currentValue = upperBound;
            pcs.firePropertyChange(PROP_CURRENT_VALUE, old, currentValue);
        }
    }

    public void setLowerBound(int newMin) {
        int oldLower = lowerBound;
        if (oldLower != newMin) {
            lowerBound = newMin;
            pcs.firePropertyChange(PROP_LOWER_BOUND, oldLower, lowerBound);
        }
        // Clamp current value if needed and notify
        if (currentValue < lowerBound) {
            int old = currentValue;
            currentValue = lowerBound;
            pcs.firePropertyChange(PROP_CURRENT_VALUE, old, currentValue);
        }
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

    public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(propertyName, listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(propertyName, listener);
    }

    @Deprecated
    public void addObserver(BasicBIObserver basicBIObserver) {
        // Deprecated: use PropertyChangeListener with bound properties instead.
    }

    private static int clamp(int val, int min, int max) {
        if (val < min) return min;
        if (val > max) return max;
        return val;
    }
}
