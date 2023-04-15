import java.util.Scanner;

public class Main {
    static int while_factorial (int k) {
        int i, fac;
        i = fac = 1;
        while (i < k) {
            i++;
            fac *= i;
        }
        return (fac);
    }

    static int for_factorial (int k) {
        int fac = 1;
        for (int i = 1; i <= k; ++i) {
            fac *= i;
        }
        return (fac);
    }

    static void menu () {
        Scanner teclado = new Scanner(System.in);

        int k;
        System.out.print("Digite um inteiro >> ");
        k = teclado.nextInt();

        int esc;
        System.out.println(" ");
        System.out.println("Escolha uma das opcoes:");
        System.out.println("[1] Fatorial usando 'while'");
        System.out.println("[2] Fatorial usando 'for'");
        System.out.print("Escolha >> ");
        esc = teclado.nextInt();

        escolha(esc, k);
    }

    static void escolha (int esc, int k) {
        int result;
        result = esc == 1 ? while_factorial(k) : for_factorial(k);
        System.out.println(" ");
        System.out.printf("Fatorial de %d = %d", k, result);
    }

    public static void main(String[] args) {
        menu();
    }
}
