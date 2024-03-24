public abstract class InjectorServiceMessage {

    public InjectorServiceMessage() {}

    public abstract void sendMessage(String message, String receiver);

    public abstract Consumer getConsumer();

}
