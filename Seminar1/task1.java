package Seminar1;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.function.IntUnaryOperator;


public class task1 {
    // дан масив числе, сделать выборку только четных чисел


    public static int[] EvenNumbers(int[] array) { //method to create an even array
        int countEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven++;// count even elements in input array to determine size of even array
            }
        }
        int[] evenArray = new int[countEven]; // create new array with length 'count'
        int index = 0; // start inde for even array
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {//if array[i] is even - add it to new array
                evenArray[index] = array[i];
                index++;
            }
        }
        return evenArray;
    }

    public static int[] CreateArray(int size, int maxVal){//create randomly generated array
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            Random random = new Random(); // creating random value
            array[i] = random.nextInt(maxVal);
        }
        return array;
    }

    public static void PrintArray(int[] array){
        for(int i=0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] array = CreateArray(10, 25);
        int[] result = EvenNumbers(array);
        PrintArray(array);
        PrintArray(result);

    }
}
