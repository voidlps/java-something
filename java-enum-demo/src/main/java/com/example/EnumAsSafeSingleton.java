package com.example;

public enum EnumAsSafeSingleton {
    INSTANCE;

    EnumAsSafeSingleton() {
        System.out.println("this constructor will be executed only once for each Enum value:" + name());
    }
}
