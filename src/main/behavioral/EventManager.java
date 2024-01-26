package main.behavioral;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EventManager {

    Map<String, ArrayList<EventListener>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        for (String op : operations) {
            listeners.put(op, new ArrayList<>());
        }
    }

    public void subscribe(String event, EventListener listener) {
        ArrayList<EventListener> users = listeners.get(event);
        if (!users.contains(listener)) {
            users.add(listener);
        }
    }

    public void unsubscribe(String event, EventListener listener) {
        ArrayList<EventListener> users = listeners.get(event);
        if (users.contains(listener)) {
            users.remove(listener);
        }
    }


    public void notify(String eventType, String file) {
        ArrayList<EventListener> users = listeners.get(eventType);
        for (EventListener user : users) {
            user.notify(eventType, file);
        }
    }
}

