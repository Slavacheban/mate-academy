package homework2;

public class HasStaticInnerClass {

    static class InClass {
        public void print() {
            System.out.println("Its inner method");
        }
    }

    public static void main(String[] args) {
        HasStaticInnerClass.InClass inClass = new HasStaticInnerClass.InClass();
        inClass.print();
    }
}
