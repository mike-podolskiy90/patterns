package com.mix.patterns.gof.behavioral.state;

public class StateContext {

    private State state = new SolidState();

    public void freeze() {
        System.out.printf("Freezing %s substance\n", state.getName());
        state.freeze(this);
    }

    public void heat() {
        System.out.printf("Heating %s substance\n", state.getName());
        state.heat(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        System.out.printf("Changing state to %s ...\n", state.getName());
        this.state = state;
    }
}
