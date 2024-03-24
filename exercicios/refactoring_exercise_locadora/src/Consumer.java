public abstract class Consumer {
    // classe está responsável por criar e inicializar o serviço de e-mail, para posteriormente utilizá-lo.
    // Isso leva à "dependência codificada"
    private final InjectorServiceMessage injectorServiceMessage;

    protected Consumer(InjectorServiceMessage injectorServiceMessage) {
        this.injectorServiceMessage = injectorServiceMessage;
    }

    public InjectorServiceMessage getInjectorServiceMessage() {
        return injectorServiceMessage;
    }

    public void processMessages(String msg, String rec) {
        this.injectorServiceMessage.sendMessage(msg, rec);
    }
}
