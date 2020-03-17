public class Driver3 {
    public static void main(String[] args) {
        int mat[][] = {{1,2,3},
                        {2,4,5},
                        {3,5,1}};

        MyUtilities m = new MyUtilities();
        if (m.isSymmetric(mat) == true) {
            System.out.println("Matrix is symmetric.");
        }
        else {
            System.out.println("Matrix is not symmetric.");
        }
    }
}
