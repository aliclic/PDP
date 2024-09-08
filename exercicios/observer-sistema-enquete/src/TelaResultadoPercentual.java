public class TelaResultadoPercentual implements EnqueteListener {
    private EnqueteSimples enquete;

    public TelaResultadoPercentual(EnqueteSimples enquete) {
        this.enquete = enquete;
        enquete.addEnqueteListener(this);
    }

    @Override
    public void novoVoto() {
        exibirResultadoPercentual();
    }

    @Override
    public void novaOpcao() {
        exibirResultadoPercentual();
    }

    public void exibirResultadoPercentual() {
        int totalVotos = enquete.getVotos().stream().mapToInt(Integer::intValue).sum();
        System.out.println("Resultado percentual:");
        for (int i = 0; i < enquete.getOpcoes().size(); i++) {
            double percentual = (totalVotos > 0) ? (enquete.getVotos().get(i) * 100.0 / totalVotos) : 0;
            System.out.println(enquete.getOpcoes().get(i) + ": " + percentual + "%");
        }
    }
}
