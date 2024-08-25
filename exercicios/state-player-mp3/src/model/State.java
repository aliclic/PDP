package model;

public interface State {
    void play(Player player);
    void stop(Player player);
    void next(Player player);
    void prev(Player player);
}
