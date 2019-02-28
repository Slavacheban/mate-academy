package homework2;

public class HasAnonimClass {
    public static void main(String[] args) {
        Runnable anonym = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am anonim class");
            }
        };

        anonym.run();
    }
}
