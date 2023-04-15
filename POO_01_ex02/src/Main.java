import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void leCoef() {
        Scanner teclado = new Scanner(System.in);
        char s;
        double[] coef = new double[3];
        for(int k = 0; k < 3; k++) {
            do {
                try {
                    s = msgCoef(k);
                    System.out.print("Coeficiente " + s + " >> ");
                    coef[k] = teclado.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Digite um numero real!");
                    teclado.next();
                }
            } while (true);
        }
        bhaskara(coef);
    }

    static char msgCoef(int k) {
        char s = ' ';
        switch (k) {
            case 0 -> s = 'a';
            case 1 -> s = 'b';
            case 2 -> s = 'c';
        }
        return (s);
    }

    static void bhaskara(double[] coef) {
        double a, b, c;
        double delta;
        double[] raizes = new double[2];
        a = coef[0];
        b = coef[1];
        c = coef[2];

        delta = b*b - 4*a*c;
        if (delta < 0) {
            System.out.println("A eq. nao possui raiz real!!");
        } else {
            raizes[0] = ((-1)*b + java.lang.Math.sqrt(delta))/(2*a);
            raizes[1] = ((-1)*b - java.lang.Math.sqrt(delta))/(2*a);
        }

        System.out.println("Raizes da equacao:");
        System.out.printf("Raiz 1: %f", raizes[0]);
        System.out.println(" ");
        System.out.printf("Raiz 2: %f", raizes[1]);
    }
    public static void main(String[] args) {
        leCoef();
    }
}
