import java.util.Scanner;

public class Driver4 {
    public static void main(String[] args) {
        MyUtilities m = new MyUtilities();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of magic square [except 6,10,14,18,...]: ");
        int n = sc.nextInt();

        m.generateMagicSquare(n);
    }
}
