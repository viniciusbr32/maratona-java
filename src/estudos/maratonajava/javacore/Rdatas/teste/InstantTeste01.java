package estudos.maratonajava.javacore.Rdatas.teste;

import java.time.Instant;

public class InstantTeste01 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());
        System.out.println(Instant.ofEpochSecond(3));
        System.out.println(Instant.ofEpochSecond(3, 1_000_000_000));
    }
}
