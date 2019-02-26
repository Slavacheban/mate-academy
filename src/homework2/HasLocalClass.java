package homework2;

public class HasLocalClass {
    private String name = "Slava";
    private int age = 24;
    private int height = 180;

    public void someMethod() {
        class LocalClass {
            public void printAge() {
                System.out.println(name + " " + age + "years old");
            }

            public void printHeaght() {
                System.out.println(height + " sm");
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.printAge();
        localClass.printHeaght();
    }
}
