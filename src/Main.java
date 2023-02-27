public class Main {

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        // Prints contents of unsorted array.
        printContents(array);

        // Sorts array using Bubble Sort.
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }

        // Prints contents of sorted array.
        printContents(array);
    }

    /**
     * Swaps values of two elements in an integer array.
     *
     * @param array Integer array.
     * @param i     Index of first element.
     * @param j     Index of second element.
     */
    public static void swap(int[] array, int i, int j) {
        // Checks if i and j are equal.
        if (i == j) {
            // No need to swap.
            return;
        }

        // Stores temp. values.
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * Prints contents of an array.
     *
     * @param array Integer array.
     */
    public static void printContents(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
