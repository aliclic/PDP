package model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private State currentState;
    private List<String> playlist;
    private int currentTrack;
    private boolean isPlaying;

    public Player() {
        this(new ReadyState());
    }

    public Player(State initialState) {
        this.currentState = initialState;
        this.playlist = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            this.playlist.add("Track " + i);
        }
        this.currentTrack = 0;
        this.isPlaying = false;
    }

    public void setPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void startPlayback() {
        System.out.println("Playing: " + playlist.get(currentTrack));
        setPlaying(true);
    }

    public void nextTrack() {
        currentTrack = (currentTrack + 1) % playlist.size();
        System.out.println("Next track: " + playlist.get(currentTrack));
    }

    public void previousTrack() {
        currentTrack = (currentTrack - 1 + playlist.size()) % playlist.size();
        System.out.println("Previous track: " + playlist.get(currentTrack));
    }

    public void changeState(State state) {
        this.currentState = state;
    }

    public void play() {
        currentState.play(this);
    }

    public void stop() {
        currentState.stop(this);
    }

    public void next() {
        currentState.next(this);
    }

    public void prev() {
        currentState.prev(this);
    }
}
