public class InsertionSort {
    public static void main(String [] args){
        int[] array = {4,6,7,8,9,0,2,3,4};
        for(int i = 1; i < array.length; i++){
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && key < array[j]){
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
    }
}
