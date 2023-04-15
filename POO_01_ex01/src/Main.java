import java.util.Scanner;

public class Main { // ex 1 - raiz quadrada
    static double sqrt(double x, double e) {
        Scanner teclado = new Scanner(System.in);
        double x0, xk, erro;
        System.out.print("Digite o chute inicial >> ");
        x0 = teclado.nextDouble();

        do {
            xk = (x0 + x/x0)/2;
            erro = xk - x0;
            x0 = xk;
        } while (erro > e);

        return (xk);
    }

    static void imprime (double x, double raiz) {
        System.out.println(" ");
        System.out.printf("Raiz de %f: %f", x, raiz);
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x, e, raiz;
        System.out.print("Digite o numero cuja raiz deseja obter >> ");
        x = teclado.nextDouble();
        System.out.println(" ");
        System.out.print("Digite o erro maximo admitido >> ");
        e = teclado.nextDouble();

        raiz = sqrt(x, e);
        imprime(x, raiz);
    }
}
