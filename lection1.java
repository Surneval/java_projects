import java.util.Scanner;
public class lection1 {
    public static void main(String[] args) {
        // String s = "qwert";
        // s.charAt(0);
        // System.out.println(s.charAt(0));

        // побитовые сдвиги
        // int a = 18;
        // System.out.println(a >> 1);

        // int [][] arr = new int [3][9];
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         System.out.println(arr[i][j]);
        //     }
        // }

        //reading fron the console
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Hello, %s!\n", name);
        iScanner.close();
    }
}
