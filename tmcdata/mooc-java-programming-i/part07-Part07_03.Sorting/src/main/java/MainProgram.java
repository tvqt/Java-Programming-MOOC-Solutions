import java.util.Arrays;
public class MainProgram {

    

    public int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i]; 
            }
        }
        return smallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int index = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i]; 
                index = i;
            }
        }
        return index;
    }

    public int indexOfSmallest(int[] array) {
        return indexOfSmallestFrom(array, 0);
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1]; 
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 1, 5, 99, 3, 12};    
    }
    
}
