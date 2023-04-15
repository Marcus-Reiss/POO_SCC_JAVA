import java.util.Scanner;

public class Experiments {
    static int[] prodv (int[] v1, int[] v2) {
        int[] v3 = new int[4];
        for (int i = 0; i < v1.length; i++) {
            v3[i] = v1[i] * v2[i];
        }
        return (v3);
    }
   static int[] setv (int[] v1, int[] v2) {
        Scanner t = new Scanner(System.in);
        int[] v3;
        int k;

       System.out.println("Vector v1:");
        for (k = 0; k < 4; k++) {
            System.out.printf("v1[%d]: ", k);
            v1[k] = t.nextInt();
        }
       System.out.println("\n\nVector v2:");
        for (k = 0; k < 4; k++) {
            System.out.printf("v2[%d]: ", k);
            v2[k] = t.nextInt();
        }

        v3 = prodv(v1, v2);

       return (v3);
    }

    static void printv (int[] vprod) {
        System.out.println("The resulted product vector:");
        System.out.print("[ ");
        for (int j : vprod) {
            System.out.printf("%s ", j);
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        int[] v1 = new int[4];
        int[] v2 = new int[4];
        int[] vprod;

        vprod = setv(v1, v2);
        printv(vprod);
    }
}
