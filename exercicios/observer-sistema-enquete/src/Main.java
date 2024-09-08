public class Main {
    public static void main(String[] args) {
        EnqueteSimples enquete = new EnqueteSimples();
        
        TelaResultado telaResultado = new TelaResultado(enquete);
        TelaResultadoPercentual telaPercentual = new TelaResultadoPercentual(enquete);

        System.out.println("Enquete: Em quem você vai votar?");
        
        enquete.addOpcao("Prof. Paiva 77.123");
        enquete.addOpcao("Outro candidato");

        TelaVotacao telaVotacao = new TelaVotacao(enquete);
        telaVotacao.exibir();
    }
}
