package com.example;

import java.util.stream.Stream;

public enum EnumWithValue {
    A("a"), B("b"), C("c");

    private final String lowercase;

    EnumWithValue(String lowercase) {
        this.lowercase = lowercase;
    }

    public String getLowercase() {
        return lowercase;
    }

    public static EnumWithValue find(String lowercase) {
        return Stream.of(EnumWithValue.values()).filter(e -> e.lowercase.equals(lowercase)).findAny().orElse(null);
    }
}
