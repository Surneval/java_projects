package HomeWork.HW1;

import java.util.Random;
import java.util.Scanner;

public class task01 {
    // написать Написать программу вычисления n-ого треугольного числа
    public static int GetNumberFromUser() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter a number > ");
        int number = Integer.parseInt(iScanner.nextLine());
        iScanner.close();
        return number;
    }

    public static int RandNumb(int minVal, int maxVal) {
        Random random = new Random();
        int number = random.nextInt(maxVal - minVal) + minVal;
        return number;
    }

    public static int Triangle (int number){
        int triangle = 0;
        for(int i =0; i < number + 1; i ++){
            triangle += i;
        }
        return triangle;
    }
    public static void main(String[] args) {
        
        int number = GetNumberFromUser();
        int triangle = Triangle(number);
        System.out.printf("Triangle number of n = %d equals %d", number, triangle);
        System.out.println('\n');

        // random number

        int rand = RandNumb(0,15);
        System.out.printf("Random number  = %d\nTriangle number of %d equals %d", rand, rand, triangle);

    }
}
