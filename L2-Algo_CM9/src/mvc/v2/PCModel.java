package mvc.v2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PCModel {
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    private int prop1;
    private String prop2;

    public PCModel() {
        setProp1(1);
        setProp2("Hello");
    }

    public void setProp1(int newValue) {
        int oldValue=this.prop1;
        this.prop1 = newValue;
        pcs.firePropertyChange("prop1", oldValue, newValue);
    }

    public int getProp1() {
        return prop1;
    }

    public void setProp2(String newValue) {
        String oldValue = this.prop2;
        this.prop2 = newValue;
        pcs.firePropertyChange("prop2", oldValue, newValue);
    }

    public String getProp2() {
        return prop2;
    }

    public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(propertyName,listener);
    }

    public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(propertyName,listener);
    }
}