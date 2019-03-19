package homework8;

import java.util.concurrent.Callable;

public class CallObject implements Callable {
    public String name;

    public CallObject(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Start thread " + name);
        return name.toUpperCase();
    }
}
