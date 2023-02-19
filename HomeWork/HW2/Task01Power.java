package HomeWork.HW2;
import java.io.*;
import java.util.Scanner;

public class Task01Power {
    //Реализовать функцию возведения числа а в степень b. a, b ∈ Z.
    //Сводя количество выполняемых действий к минимуму
    public static String [] getDataFromText() {
        String inputName = "input.txt";
        Scanner sc = new Scanner(new File(inputName));
        String [] array;

        while(sc.hasNext()){
            array = sc.nextLine().split(" ");
        }
        return array;
    }

    public static int expo(int a, int b){
        int result = a;
        while (b > 0){
            result *= a;
            b--;

        }
        return result;
    }

    public static void main(String[] args) {
        String [] arrayA = getDataFromText();
        System.out.println(arrayA);

    }

}
