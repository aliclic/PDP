package model;

public class NullNotification implements Notification {
    @Override
    public void notifyUser(String msg) {
        System.out.println(this.getClass().getSimpleName() + " -> " + msg);
    }
}
