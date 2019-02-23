package homework1;

public class Diamond {

    int width;

    public Diamond(int width) {
        this.width = width;
    }

    public void printDiamond() {
        int i;
        int j;
        int k;
        for (i = 1; i <= width; i++) {
            for (k = width - 1; k >= i; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for (i = width - 1; i >= 1; i--) {
            for (k = width - 1; k >= i; k--) {
                System.out.print(" ");
            }
            for (j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
