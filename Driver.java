import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        MyUtilities m = new MyUtilities();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length = ");
        int n = sc.nextInt();
        int myArray[] = new int[n];

        System.out.println(m.splitHighestValue(myArray, n));

    }
}

