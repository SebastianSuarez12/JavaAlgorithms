public class BubbleSort {
    public static void main(String [] args) {
        int array[] = {5, 8, 3, 0, 1, 3};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }

        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
