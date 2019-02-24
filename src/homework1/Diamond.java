package homework1;

public class Diamond {

    private int width;

    public Diamond(int width) {
        this.width = width;
    }

    public void printDiamond() {

        for (int i = 1; i <= width; i++) {
            for (int k = width - 1; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for (int i = width - 1; i >= 1; i--) {
            for (int k = width - 1; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
