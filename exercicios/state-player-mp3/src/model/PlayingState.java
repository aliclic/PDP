package model;

public class PlayingState implements State {
    @Override
    public void play(Player player) {
        System.out.println("Pausing playback...");
        player.setPlaying(false);
        player.changeState(new ReadyState());
    }

    @Override
    public void stop(Player player) {
        System.out.println("Stopping playback and locking player...");
        player.setPlaying(false);
        player.changeState(new LockedState());
    }

    @Override
    public void next(Player player) {
        player.nextTrack();
    }

    @Override
    public void prev(Player player) {
        player.previousTrack();
    }
}
