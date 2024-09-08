import java.util.ArrayList;
import java.util.List;

public class EnqueteSimples {
    private List<String> opcoes = new ArrayList<>();
    private List<Integer> votos = new ArrayList<>();
    private List<EnqueteListener> listeners = new ArrayList<>();

    public void addOpcao(String opcao) {
        opcoes.add(opcao);
        votos.add(0);
        disparaNovaOpcao();
    }

    public void votar(int opcaoIndex) {
        if (opcaoIndex >= 0 && opcaoIndex < votos.size()) {
            votos.set(opcaoIndex, votos.get(opcaoIndex) + 1);
            disparaNovoVoto();
        }
    }

    public List<String> getOpcoes() {
        return opcoes;
    }

    public List<Integer> getVotos() {
        return votos;
    }

    public void addEnqueteListener(EnqueteListener listener) {
        listeners.add(listener);
    }

    private void disparaNovoVoto() {
        for (EnqueteListener listener : listeners) {
            listener.novoVoto();
        }
    }

    private void disparaNovaOpcao() {
        for (EnqueteListener listener : listeners) {
            listener.novaOpcao();
        }
    }
}
