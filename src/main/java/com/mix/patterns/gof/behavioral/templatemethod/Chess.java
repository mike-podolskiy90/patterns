package com.mix.patterns.gof.behavioral.templatemethod;

public class Chess extends Game {

    @Override
    protected void initializeGame() {
        // chess specific initialization actions
    }

    @Override
    protected void playGame() {
        // chess specific play actions
    }

    @Override
    protected void endGame() {
        // chess specific actions to end a game
    }

    @Override
    protected void printWinner() {
        // chess specific actions to print winner
    }

}
