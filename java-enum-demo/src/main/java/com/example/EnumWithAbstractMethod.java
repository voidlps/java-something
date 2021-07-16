package com.example;

import java.util.function.Supplier;

public enum EnumWithAbstractMethod {
    A {
        @Override
        public Supplier<String> getFunction() {
            return () -> "hello";
        }
    }, B {
        @Override
        public Supplier<String> getFunction() {
            return () -> "world";
        }
    };

    public abstract Supplier<String> getFunction();
}
