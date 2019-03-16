package homework7.singleton;

import java.util.concurrent.atomic.AtomicInteger;

public class SinglCount {
    private static SinglCount ourInstance = new SinglCount();
    private AtomicInteger atomicInteger;

    public static SinglCount getInstance() {
        if(ourInstance == null) {
            return ourInstance;
        }else {
            ourInstance = new SinglCount();
            return ourInstance;
        }
    }

    private SinglCount() {
        this.atomicInteger = new AtomicInteger();
    }

    public int inc() {
        return atomicInteger.incrementAndGet();
    }

    public int dec() {
        return atomicInteger.decrementAndGet();
    }
}
