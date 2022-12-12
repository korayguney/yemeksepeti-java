package l4classesobjects.enumerationchallenge3;

import java.time.LocalDateTime;

public enum System {
    OUT {
        @Override
        public void print(String s) {
            java.lang.System.out.print("[INFO] " + LocalDateTime.now() + " : " + s);
        }

        @Override
        public void println(String s) {
            java.lang.System.out.println("[INFO] " + LocalDateTime.now() + " : " + s);
        }
    },
    ERR {
        @Override
        public void print(String s) {
            java.lang.System.err.print("[ERROR] " + LocalDateTime.now() + " : " + s);
        }

        @Override
        public void println(String s) {
            java.lang.System.err.println("[ERROR] " + LocalDateTime.now() + " : " + s);
        }
    };

    public abstract void print(String s);
    public abstract void println(String s);
}
