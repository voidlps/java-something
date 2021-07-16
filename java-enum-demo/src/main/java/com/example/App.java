package com.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.EnumMap;
/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        EnumExample e1 = EnumExample.valueOf("A");
        switch (e1) {
        case A: {
            int i = e1.ordinal();
            System.out.println(e1.name() + ":" + i);
            break;
        }
        case B: {
            int i = e1.ordinal();
            System.out.println(e1.name() + ":" + i);
            break;
        }
        default:
            throw new IllegalStateException("Should never having this state");
        }

        EnumWithValue e2 = EnumWithValue.find("b");
        System.out.println(e2.getClass().getCanonicalName());
        System.out.println(e2.name());

        {
            EnumGroup doWeNeedThis = EnumGroup.valueOf("A");
            System.out.println(doWeNeedThis.getClass().getCanonicalName());
            System.out.println(doWeNeedThis.name());

        }
        // {
        //     EnumGroup doWeNeedThis = EnumGroup.valueOf("X");
        //     System.out.println(doWeNeedThis.getClass().getCanonicalName());
        //     System.out.println(doWeNeedThis.name());
        // }

        {
            BadEnum bad = BadEnum.B;
            System.out.println(bad.getClass().getCanonicalName() + "." + bad.name() + ":" + bad.getHello());
            bad.setHello(100);
        }
        {
            BadEnum bad = BadEnum.B;
            System.out.println(bad.getClass().getCanonicalName() + "." + bad.name() + ":" + bad.getHello());
        }

        System.out.println(System.identityHashCode(EnumAsSafeSingleton.INSTANCE));
        System.out.println(System.identityHashCode(EnumAsSafeSingleton.INSTANCE));

        // very fast on get
        // EnumMap<EnumExample, List<String>> enumMap = new EnumMap<>();
        // enumMap.put(EnumExample.A, Stream.of("A1","A2","A3","A4").collect(Collectors.toList()));
        // enumMap.put(EnumExample.B, Stream.of("B1","B2").collect(Collectors.toList()));
    }
}
