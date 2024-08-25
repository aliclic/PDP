package model;

public class ReadyState implements State {
    @Override
    public void play(Player player) {
        System.out.println("Player is ready. Starting playback...");
        player.startPlayback();
        player.changeState(new PlayingState());
    }

    @Override
    public void stop(Player player) {
        System.out.println("Player is ready. Locking player...");
        player.changeState(new LockedState());
    }

    @Override
    public void next(Player player) {
        System.out.println("Player is ready. Next action does nothing.");
    }

    @Override
    public void prev(Player player) {
        System.out.println("Player is ready. Previous action does nothing.");
    }
}
