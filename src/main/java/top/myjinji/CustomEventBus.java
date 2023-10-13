package top.myjinji;

import java.util.ArrayList;
import java.util.List;

public class CustomEventBus {
    private List<EventListener> listeners = new ArrayList<>();

    public void addListener(EventListener listener) {
        listeners.add(listener);
    }

    public void removeListener(EventListener listener) {
        listeners.remove(listener);
    }

    public void postEvent(EventType eventType, Object data) {
        for (EventListener listener : listeners) {

            listener.onEvent(eventType, data);
        }
    }
}