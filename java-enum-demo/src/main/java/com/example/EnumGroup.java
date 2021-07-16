package com.example;

public interface EnumGroup {
    String getGroup();
    String name();

    public static EnumGroup valueOf(String v) {
        // are we okay with this?
        try {
            return Group1.valueOf(v);
        } catch (IllegalArgumentException e) {
            return Group2.valueOf(v);
        }
    }

    public enum Group1 implements EnumGroup {
        A,B,C;

        @Override
        public String getGroup() {
            return "Group1";
        }

    }

    public enum Group2 implements EnumGroup {
        D,E,F;

        @Override
        public String getGroup() {
            return "Group2";
        }

    }

}
