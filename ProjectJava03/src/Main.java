import java.util.Scanner;

public class Main {
    static void setv (int size, int[] v) {
        for (int i = 0; i < size; i++) {
            for (int j = i * size; j < i * size + size; j++) {
                if (j == i * (size + 1)) {
                    v[j] = 1;
                } else {
                    v[j] = 0;
                }
            }
        }
        printMatrix(size, v);
    }

    static void printMatrix (int size, int[] v) {
        System.out.println("The final MATRIX:");
        for (int i = 0; i < size; i++) {
            for (int j = i * size; j < size * (i + 1); j++) {
                System.out.printf("%d ", v[j]);
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int size;
        System.out.print("Enter the matrix size: ");
        size = t.nextInt();

        int[] v = new int[size * size];

        setv(size, v);
    }
}
