package model;

public class LockedState implements State {
    @Override
    public void play(Player player) {
        System.out.println("Unlocking player...");
        player.changeState(new ReadyState());
    }

    @Override
    public void stop(Player player) {
        if (player.isPlaying()) {
            System.out.println("Stopping playback and unlocking player...");
            player.setPlaying(false);
            player.changeState(new ReadyState());
        } else {
            System.out.println("Player is already stopped and locked.");
        }
    }

    @Override
    public void next(Player player) {
        System.out.println("Player is locked. Next action does nothing.");
    }

    @Override
    public void prev(Player player) {
        System.out.println("Player is locked. Previous action does nothing.");
    }
}
