public class SelectionSort {
    public static void main(String [] args) {
        int array[] = {5, 7, 2, 0, 8, 4, 2, 8};

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }

            int aux = array[i];
            array[i] = array[min];
            array[min] = aux;

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
