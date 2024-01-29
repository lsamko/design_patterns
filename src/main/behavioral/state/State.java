package main.behavioral.state;

public abstract class State {

    Game game;

    protected State(Game game) {
        this.game = game;
    }

    public abstract void onWelcomeScreen();
    public abstract void onPlaying();
    public abstract void onBreak();
    public abstract void onEndGame();
}
