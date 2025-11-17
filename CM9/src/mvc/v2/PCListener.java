package mvc.v2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PCListener implements PropertyChangeListener {
    public void propertyChange(PropertyChangeEvent event) {
        System.out.println(event.getSource());
        System.out.println(event.getPropertyName());
        System.out.println(event.getOldValue());
        System.out.println(event.getNewValue());
    }
}