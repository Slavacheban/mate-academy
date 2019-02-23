package homework1;

public class HW1 {
    public static void main(String[] args) {
        System.out.println("result of match");
        System.out.println(result(2, 5, 2, 5));

        System.out.println("Рисуем ромб");
        romb(7);

        System.out.println("Находим заданную степень числа");
        System.out.println(stepen(2, 5));

        System.out.println("Находим факториал числа");
        System.out.println(factorial(5));

        System.out.println("Сравниваем время работы разных сортировок");
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = 100000 - i;
        }

        System.out.print("Шейкерная:  ");
        shakerSort(array);
        System.out.println("");

        System.out.print("Сортировка расческой:  ");
        combSort(array);
        System.out.println();

        System.out.print("Сортировка вставками:  ");
        insertionSort(array);
        System.out.println("");

        System.out.print("Сортировка Шелла:  ");
        shellSort(array);
        System.out.println("");

        System.out.print("Пузырьковая:  ");
        babbleSort(array);
        System.out.println("");

        System.out.println("Находим максимальный элемент в матрице");
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + j;
            }
        }
        System.out.println(getMaxOfMatrix(arr));
    }

    private static int getMaxOfMatrix(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max) max = arr[i][j];
            }
        }
        return max;
    }

    public static int result(int a, int b, int c, int d) {
        return (a == c && b == d) ? 2 : ((a > b && c > d) || (a < b && c < d) || (a == b && c == d)) ? 1 : 0;
    }

    public static void romb(int n) {
        int i, j, k;
        for (i = 1; i <= n; i++) {
            for (k = n - 1; k >= i ; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for (i = n - 1; i >= 1 ; i--) {
            for (k = n - 1; k >= i ; k--) {
                System.out.print(" ");
            }
            for (j = i; j>= 1 ; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static double stepen(double a, double n) {
        return Math.pow(a, n);
    }

    public static int factorial(int n) {
        if (n == 1 || n == 0) return 1;
        else return n * (factorial(n - 1));
    }

    public static void babbleSort(int[] array) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int c = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = c;
                }
            }
        }
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);
    }

    public static void shakerSort(int[] array) {
        long startTime = System.currentTimeMillis();

        int size = array.length;
        boolean swapped = false;
        for (int k = size - 1; k > 0; k--) {
            swapped = false;
            for (int i = k; i > size - 1 - k; i--)
                if (array[i] < array[i-1]) {
                    // swap
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                    swapped = true;
                }

            for (int i = size - k; i < k; i++)
                if (array[i] > array[i+1]) {
                    // swap
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapped = true;
                }

            if (!swapped)
                break;
        }

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);
    }

    public static void combSort(int[] array) {
        long startTime = System.currentTimeMillis();

        int gap = array.length;
        boolean swapped = true;
        while (gap > 1 || swapped) {
            if (gap > 1)
                gap = (int) (gap / 1.247330950103979);

            int i = 0;
            swapped = false;
            while (i + gap < array.length) {
                if (array[i] > array[i + gap]) {
                    int t = array[i];
                    array[i] = array[i + gap];
                    array[i + gap] = t;
                    swapped = true;
                }
                i++;
            }
        }
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);
    }

    public static void insertionSort(int[] array) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < array.length - 1; i++) {
            int min = array[0];
            for (int j = 0; j < array.length; j++) {
                if (array[j] < min) min = array[j];
            }
            array[i] = min;
        }
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);
    }

    public static void shellSort(int[] array) {
        long startTime = System.currentTimeMillis();
        int i, j, k, h, m=0, b=array.length;
        int[] d = { 1, 4, 10, 23, 57, 145, 356, 911, 1968, 4711, 11969, 27901,
                84801, 213331, 543749, 1355339, 3501671, 8810089, 21521774,
                58548857, 157840433, 410151271, 1131376761, 2147483647 };
        while (d[m] < b) ++m;
        while (--m >= 0){
            k = d[m];
            for (i = k; i < b; i++){     // k-сортировка
                j=i;
                h=array[i];
                while ((j >= k) && (array[j-k] > h)){
                    array[j]=array[j-k];
                    j -= k;
                }
                array[j] = h;
            }
        }

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
