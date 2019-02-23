package homework1;

public class Sort {

    public static int[] babbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int c = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = c;
                }
            }
        }
        return array;
    }

    public static int[] shakerSort(int[] array) {

        int size = array.length;
        boolean swapped = false;
        for (int k = size - 1; k > 0; k--) {
            swapped = false;
            for (int i = k; i > size - 1 - k; i--)
                if (array[i] < array[i - 1]) {
                    // swap
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    swapped = true;
                }

            for (int i = size - k; i < k; i++)
                if (array[i] > array[i + 1]) {
                    // swap
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }

            if (!swapped)
                break;
        }

        return array;
    }

    public static int[] combSort(int[] array) {

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
        return array;
    }

    public static int[] insertionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int min = array[0];
            for (int j = 0; j < array.length; j++) {
                if (array[j] < min) min = array[j];
            }
            array[i] = min;
        }
        return array;
    }

    public static int[] shellSort(int[] array) {

        int i, j, k, h, m = 0, b = array.length;
        int[] d = {1, 4, 10, 23, 57, 145, 356, 911, 1968, 4711, 11969, 27901,
                84801, 213331, 543749, 1355339, 3501671, 8810089, 21521774,
                58548857, 157840433, 410151271, 1131376761, 2147483647};
        while (d[m] < b) ++m;
        while (--m >= 0) {
            k = d[m];
            for (i = k; i < b; i++) {     // k-сортировка
                j = i;
                h = array[i];
                while ((j >= k) && (array[j - k] > h)) {
                    array[j] = array[j - k];
                    j -= k;
                }
                array[j] = h;
            }
        }

        return array;
    }
}
