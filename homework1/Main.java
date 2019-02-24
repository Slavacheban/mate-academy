package homework1;

public class Main {
    public static void main(String[] args) {
        System.out.print("Result of match: ");
        FootballMatch fm = new FootballMatch();
        System.out.println(fm.result(2, 3, 4, 5));

        System.out.println("Print diamond");
        new Diamond(7).printDiamond();

        System.out.println("Find the degree of number");
        System.out.println(Number.pow(3, 5));

        System.out.println("Find the factorial of number");
        System.out.println(Factorial.factorial(5));

        System.out.println("Compare the working time of different sorts");
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = 100000 - i;
        }


        System.out.print("Shaker sort:  ");
        long startTime = System.currentTimeMillis();
        Sort.shakerSort(array);
        long stopTime = System.currentTimeMillis();
        System.out.println(stopTime - startTime);

        System.out.print("Comb sort:  ");
        startTime = System.currentTimeMillis();
        Sort.combSort(array);
        stopTime = System.currentTimeMillis();
        System.out.println(stopTime - startTime);

        System.out.print("Insert sort:  ");
        startTime = System.currentTimeMillis();
        Sort.insertionSort(array);
        stopTime = System.currentTimeMillis();
        System.out.println(stopTime - startTime);

        System.out.print("Shell sort:  ");
        startTime = System.currentTimeMillis();
        Sort.shellSort(array);
        stopTime = System.currentTimeMillis();
        System.out.println(stopTime - startTime);

        System.out.print("Babble sort:  ");
        startTime = System.currentTimeMillis();
        Sort.babbleSort(array);
        stopTime = System.currentTimeMillis();
        System.out.println(stopTime - startTime);

        System.out.println("Find the max of matrix");
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + j;
            }
        }
        System.out.println(new Matrix(arr).getMax());
    }
}
