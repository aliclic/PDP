import model.Player;
import model.ReadyState;
import model.State;

public class Client {
    public static void main(String[] args) {

        State initialState = new ReadyState();

        Player player = new Player(initialState);

        System.out.println("Initial State: Ready");
        player.play();  // inicia a reprodução e mudar o estado para Playing
        player.next();  // Deve ir para a próxima faixa
        player.stop();  // Deve parar a reprodução e mudar o estado para Locked
        player.play();  // Deve desbloquear e mudar para o estado Ready
        player.prev();  // Deve não fazer nada, pois está no estado Ready
        player.play();  // Deve iniciar a reprodução novamente e mudar o estado para Playing
    }
}
