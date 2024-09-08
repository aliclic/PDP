public class TelaVotacaoCtrl {
    private EnqueteSimples enquete;

    public TelaVotacaoCtrl(EnqueteSimples enquete) {
        this.enquete = enquete;
    }

    public void registrarVoto(int opcao) {
        enquete.votar(opcao);
    }
}
