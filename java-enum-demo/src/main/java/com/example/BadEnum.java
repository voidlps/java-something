package com.example;

public enum BadEnum {
    A, B, C;
    private int hello;

    public BadEnum setHello(int i) {
        hello = i;
        return this;
    }
    public int getHello() {
        return hello;
    }
}
