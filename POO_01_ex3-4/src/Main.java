import java.util.Scanner;

public class Main {
    static void treeEins(int n) {
        for(int k = n; k > 0; k--) {
            for(int j = k; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static  void treeZwei(int n) {
        int ii = 0;
        for(int k = n; k > 0; k--) {
            for(int i = 0; i < ii; i++) {
                System.out.print(" ");
            }
            ii++;
            for(int j = k; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.print("Digite um numero inteiro >> ");
        n = teclado.nextInt();

        treeEins(n);
        System.out.println(" ");
        treeZwei(n);
    }
}
