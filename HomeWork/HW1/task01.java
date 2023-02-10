package HomeWork.HW1;
import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task01 {
    // написать Написать программу вычисления n-ого треугольного числа
    public static int GetNumber() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter a number > ");
        int number = Integer.parseInt(iScanner.nextLine());
        iScanner.close();
        return number;
    }

    
    public static void main(String[] args) {
        
        //int number = GetNumber();

    }
}
