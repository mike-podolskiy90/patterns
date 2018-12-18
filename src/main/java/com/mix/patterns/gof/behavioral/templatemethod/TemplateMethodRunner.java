package com.mix.patterns.gof.behavioral.templatemethod;

public class TemplateMethodRunner {

    public static void main(String[] args) {
        final GameType gameType = GameType.CHESS;
        Game game = gameType.getGame();
        game.playOneGame(2);
    }
}
