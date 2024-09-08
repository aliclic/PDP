public class EnqueteEvent {
    private EnqueteSimples enquete;
    private String opcao;

    public EnqueteEvent(EnqueteSimples enquete, String opcao) {
        this.enquete = enquete;
        this.opcao = opcao;
    }

    public EnqueteSimples getEnquete() {
        return enquete;
    }

    public String getOpcao() {
        return opcao;
    }
}
