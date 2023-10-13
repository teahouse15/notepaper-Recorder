package top.myjinji;


public interface EventListener {
    void onEvent(EventType eventType, Object data);
}