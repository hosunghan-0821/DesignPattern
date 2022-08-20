package java_interface;

import java.util.Observer;

public interface Subject {
    public void registerObserver(java_interface.Observer o);
    public void removeObserver(java_interface.Observer o);
    public void notifyObservers();
}

