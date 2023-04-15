import java.util.Scanner;

public class Main {
    static int setN() {
        Scanner teclado = new Scanner(System.in);
        int n;
        do {
            try {
                System.out.print("Digite um numero inteiro >> ");
                n = teclado.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("ERRO! Digite um numero INTEIRO !!");
            }
        } while (true);
        return (n);
    }

    static int parImpar(int n) {
        int mid;
        mid = ((n % 2 == 0) ? n/2 : (n + 1)/2);
        return (mid);
    }
    static boolean verificaPrimo(int n, boolean exe) {
        if (n == 1) {
            if (exe) {
                conclui(false, n, 1);
            }
            return (false);
        } else {
            int mid = parImpar(n);
            int c = 0;
            int mdiv = 0;
            boolean primo;
            for (int i = 2; i <= mid; i++) {
                if (n % i == 0) {
                    mdiv = i;
                    c++;
                    break;
                }
            }
            primo = (c == 0);
            if (exe) {
                conclui(primo, n, mdiv);
            }
            return (primo);
        }
    }

    static void menorPrimo(int n) {
        boolean primo;
        if (n < 3) {
            System.out.println(" ");
            System.out.printf("Nao existe primo menor que %d !!", n);
        } else {
            int nprimo = 0;
            for (int i = n - 1; i > 0; i--) {
                primo = verificaPrimo(i, false);
                if (primo) {
                    nprimo = i;
                    break;
                }
            }
            System.out.println(" ");
            System.out.printf("Primeiro primo menor que %d: %d", n, nprimo);
        }
    }

    static void conclui(boolean primo, int n, int mdiv) {
        if (primo) {
            System.out.printf("O numero %d EH PRIMO !!", n);
        } else {
            System.out.printf("O numero %d NAO EH PRIMO !!", n);
            System.out.println(" ");
            System.out.printf("Seu menor divisor eh %d", mdiv);
        }
    }
    public static void main(String[] args) {
        int n;
        boolean primo;
        n = setN();
        primo = verificaPrimo(n, true);
        menorPrimo(n);
    }
}
