public class SMSServiceInjector extends InjectorServiceMessage {
    @Override
    public void sendMessage(String message, String receiver) {
        // Neste ponto teríamos a lógica (conjunto de instruções) para enviar um email
        System.out.println("SMS sent to " + receiver + " with Message= " + message);
    }

    @Override
    public Consumer getConsumer() {
        return new MyApplication(this);
    }
}
