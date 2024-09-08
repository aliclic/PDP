public class TelaResultado implements EnqueteListener {
    private EnqueteSimples enquete;

    public TelaResultado(EnqueteSimples enquete) {
        this.enquete = enquete;
        enquete.addEnqueteListener(this);
    }

    @Override
    public void novoVoto() {
        exibirResultado();
    }

    @Override
    public void novaOpcao() {
        exibirResultado();
    }

    public void exibirResultado() {
        System.out.println("Resultado parcial:");
        for (int i = 0; i < enquete.getOpcoes().size(); i++) {
            System.out.println(enquete.getOpcoes().get(i) + ": " + enquete.getVotos().get(i) + " votos");
        }
    }
}
