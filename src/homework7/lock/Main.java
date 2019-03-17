package homework7.lock;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ConcurrencyLockExample concurrencyLockExample = new ConcurrencyLockExample
                (new Resource(new ArrayList<>()));
        new Thread(concurrencyLockExample).start();
        new Thread(concurrencyLockExample).start();
    }
}
