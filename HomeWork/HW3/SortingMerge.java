package HomeWork.HW3;
import java.util.Random;

public class SortingMerge {
    public static int[] getArray(int length, int maxVal){
        int[] array = new int[length];
        Random random = new Random(); // creating random value
        for(int i = 0; i < length; i++){
            array[i] = random.nextInt(maxVal);
        }
        return array;
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }
    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[arr.length];
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }

        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            arr[k] = temp[i];
            k++;
            i++;
        }
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        int[] array = getArray(11, 15);
        System.out.println("Original array:");
        printArray(array);
        mergeSort(array, 0, array.length - 1);
        System.out.println("Sorted array:");
        printArray(array);
    }
}
