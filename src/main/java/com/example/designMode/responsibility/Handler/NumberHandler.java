package com.example.designMode.responsibility.Handler;

public abstract class NumberHandler {

    private NumberHandler numberHandler;

    public void setNumberHandler(NumberHandler handler) {
        this.numberHandler = handler;
    }

    public NumberHandler getNumberHandler() {
        return numberHandler;
    }

    public abstract void getMessage(String status);
}
