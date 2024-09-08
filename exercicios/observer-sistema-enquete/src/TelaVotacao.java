import java.util.Scanner;

public class TelaVotacao {
    private EnqueteSimples enquete;
    private TelaVotacaoCtrl controlador;

    public TelaVotacao(EnqueteSimples enquete) {
        this.enquete = enquete;
        this.controlador = new TelaVotacaoCtrl(enquete);
    }

    public void exibir() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Escolha uma opção para votar:");
            for (int i = 0; i < enquete.getOpcoes().size(); i++) {
                System.out.println(i + ": " + enquete.getOpcoes().get(i));
            }
            int opcao = scanner.nextInt();
            controlador.registrarVoto(opcao);
        }
    }
}
