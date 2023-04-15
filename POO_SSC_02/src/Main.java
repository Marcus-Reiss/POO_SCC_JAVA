import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static int whileFactorial (int k) {
        int i, fac;
        i = fac = 1;
        while (i < k) {
            i++;
            fac *= i;
        }
        return (fac);
    }

    static int forFactorial (int k) {
        int fac = 1;
        for (int i = 1; i <= k; ++i) {
            fac *= i;
        }
        return (fac);
    }

    static void menu () {
        Scanner teclado = new Scanner(System.in);

        int k, kk;
        do {
            try {
                System.out.print("Digite um inteiro >> ");
                kk = teclado.nextInt();
                k = kk;
                if (k <= 0) {
                    System.out.println("Erro! Digite um inteiro POSITIVO!");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro! Não foi digitado um INTEIRO!");
                teclado.next();
            }
        } while (true);

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
        result = esc == 1 ? whileFactorial(k) : forFactorial(k);
        System.out.println(" ");
        System.out.printf("Fatorial de %d: (%d! = %d)", k, k, result);
    }

    public static void main(String[] args) {
        menu();
    }
}
