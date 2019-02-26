package homework2;

public class HasNestedClass {
    String name = "sajhfdajk";

    class Inner {
        public void printName() {
            System.out.println("InnerMethod says: The name of Outerclass is " + name );
        }
    }

    public static void main(String[] args) {
            new HasNestedClass().new Inner().printName();
    }
}
