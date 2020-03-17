import java.util.Arrays;
import java.util.Scanner;

public class MyUtilities {
    public String splitHighestValue(int[] a, int n) {                // Number 1
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Integer " + (i + 1) + " = ");
            int number = sc.nextInt();
            a[i] = number;
        }

        int maxValue = a[0];
        for(int x = 1; x < a.length; x++) {
            if(a[x] > maxValue) {
                maxValue = a[x];
            }
        }

        int b[] = new int[a.length - 1];
        for(int i = 0, j = 0; i < a.length; i++) {
            if(a[i] != maxValue) {
                b[j] = a[i];
                j++;
            }
        }

        int maxValueB = b[0];
        for(int x = 1; x < b.length; x++) {
            if(b[x] > maxValueB) {
                maxValueB = b[x];
            }
        }

        int add = maxValue - maxValueB;
        int c[] = new int[a.length + 1];
        for(int i = 0, j = 0; i < a.length; i++) {
            if(a[i] != maxValue) {
                c[j] = a[i];
            }
            else {
                c[j] = maxValueB;
                j++;
                c[j] = add;
            }
            j++;
        }

        return Arrays.toString(c);
    }

    public String arrayShifter(int[] a, int n) {                    // Number 2
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Integer " + (i + 1) + " = ");
            int number = sc.nextInt();
            a[i] = number;
        }

        int b[] = new int[n];

        Scanner scan = new Scanner(System.in);
        System.out.print("ROT = ");
        int rot = scan.nextInt();

        for (int x = 0; x < rot; x++) {
            if (x > 0) {
                a = b;
                int c[] = new int[n];
                b = c;
            }
            for (int i = 0, j = 0; i < a.length; i++) {
                if (i != a.length - 1) {
                    j++;
                    b[j] = a[i];
                }
                else {
                    j = 0;
                    b[j] = a[i];
                }
            }
        }
        return Arrays.toString(b);
    }

    public boolean isSymmetric(int mat[][]) {          // Number 3
        boolean test = false;
        if (mat[0][0] == mat[2][2]) {
            if (mat[0][1] == mat[1][0]) {
                if (mat[0][2] == mat[2][0]) {
                    if (mat[1][2] == mat[2][1]) {
                        test = true;
                    }
                }
            }
        }
        return test;
    }

    public void generateMagicSquare(int n) {                // number 4
        if (n%2 != 0) {
            int[][] magicSquare = new int[n][n];

            // Initialize position for 1
            int i = n/2;
            int j = n-1;

            // One by one put all values in magic square
            for (int num = 1; num <= n*n; )
            {
                if (i==-1 && j==n) //3rd condition
                {
                    j = n-2;
                    i = 0;
                }
                else
                {
                    //1st condition helper if next number
                    // goes to out of square's right side
                    if (j == n)
                        j = 0;

                    //1st condition helper if next number is
                    // goes to out of square's upper side
                    if (i < 0)
                        i=n-1;
                }

                //2nd condition
                if (magicSquare[i][j] != 0)
                {
                    j -= 2;
                    i++;
                    continue;
                }
                else
                    //set number
                    magicSquare[i][j] = num++;

                //1st condition
                j++;  i--;
            }

            // print magic square
            System.out.println("The Magic Square for " + "n=" + n + " :");
            System.out.println("Sum of each row or column "+n*(n*n+1)/2+":");
            for(i=0; i<n; i++)
            {
                for(j=0; j<n; j++)
                    System.out.print(magicSquare[i][j]+" ");
                System.out.println();
            }
        }
        else {
            int[][] arr = new int[n][n];
            int i, j;

            // filling matrix with its count value
            // starting from 1;
            for ( i = 0; i < n; i++)
                for ( j = 0; j < n; j++)
                    arr[i][j] = (n*i) + j + 1;

            // change value of Array elements
            // at fix location as per rule
            // (n*n+1)-arr[i][j]
            // Top Left corner of Matrix
            // (order (n/4)*(n/4))
            for ( i = 0; i < n/4; i++)
                for ( j = 0; j < n/4; j++)
                    arr[i][j] = (n*n + 1) - arr[i][j];

            // Top Right corner of Matrix
            // (order (n/4)*(n/4))
            for ( i = 0; i < n/4; i++)
                for ( j = 3 * (n/4); j < n; j++)
                    arr[i][j] = (n*n + 1) - arr[i][j];

            // Bottom Left corner of Matrix
            // (order (n/4)*(n/4))
            for ( i = 3 * n/4; i < n; i++)
                for ( j = 0; j < n/4; j++)
                    arr[i][j] = (n*n+1) - arr[i][j];

            // Bottom Right corner of Matrix
            // (order (n/4)*(n/4))
            for ( i = 3 * n/4; i < n; i++)
                for ( j = 3 * n/4; j < n; j++)
                    arr[i][j] = (n*n + 1) - arr[i][j];

            // Centre of Matrix (order (n/2)*(n/2))
            for ( i = n/4; i < 3 * n/4; i++)
                for ( j = n/4; j < 3 * n/4; j++)
                    arr[i][j] = (n*n + 1) - arr[i][j];

            // Printing the magic-square
            for (i = 0; i < n; i++)
            {
                for ( j = 0; j < n; j++)
                    System.out.print(arr[i][j]+" ");
                System.out.println();
            }
        }

    }
}
