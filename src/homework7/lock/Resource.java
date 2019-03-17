package homework7.lock;

import java.util.ArrayList;

public class Resource {
    private ArrayList<Integer> list;

    public Resource(ArrayList<Integer> list) {
        this.list = list;
    }

    public void doSomething(){
        list.add(1);
    }
}
