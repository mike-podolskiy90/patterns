package com.mix.patterns.gof.behavioral.templatemethod;

public enum GameType {
    CHESS {
        @Override
        public Game getGame() {
            return new Chess();
        }
    },
    MONOPOLY {
        @Override
        public Game getGame() {
            return new Chess();
        }
    };

    public abstract Game getGame();
}
