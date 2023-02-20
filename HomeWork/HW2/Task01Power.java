package HomeWork.HW2;

import java.io.*;
import java.io.PrintWriter;

public class Task01Power {
    // Реализовать функцию возведения числа а в степень b. a, b ∈ Z.
    // Сводя количество выполняемых действий к минимуму
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("C:/Users/nadez/Desktop/java/HomeWork/HW2/input.txt"));
            String aLine = reader.readLine().trim();
            String bLine = reader.readLine().trim();
            String[] arrayA = aLine.split("\\s+");
            String[] arrayB = bLine.split("\\s+");
            int a = Integer.parseInt(arrayA[1]);
            int b = Integer.parseInt(arrayB[1]);
            reader.close();
            double result = a;
            while (b > 0) {
                result *= a;
                b--;
            }
            PrintWriter writer = new PrintWriter(new File("output.txt"));
            writer.printf("%s ^ %s = %.0f\n", arrayA[0], arrayB[0], result);
            System.out.println(arrayA[0] + " raised to the power of " + arrayB[0] + " is " + result);
            writer.close();
        } catch (IOException e) {
            System.out.println("Error reading input file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format: " + e.getMessage());
        }

    }

}
