import java.util.ArrayList;
import java.util.Scanner;
import  java.lang.Math;

public class Main {
    static ArrayList<Double> setEquation() {
        Scanner teclado = new Scanner(System.in);
        int ord;
        ArrayList<Double> coef = new ArrayList<Double>();
        do {
            try {
                System.out.print("Digite a ordem (grau) da equacao >> ");
                ord = teclado.nextInt();
                if (ord < 0) {
                    System.out.println("ERRO !! Digite um INTEIRO POSITIVO !");
                }
                break;
            } catch (Exception e) {
                System.out.println("ERRO !! Digite um numero INTEIRO !");
                teclado.next();
            }
        } while (true);

        double c;
        for (int k = 0; k < ord + 1; k++) {
            do {
                try {
                    System.out.printf("Digite o coeficiente %d (do maior para o menor grau) >> ", k + 1);
                    c = teclado.nextDouble();
                    break;
                } catch (Exception e) {
                    System.out.println("ERRO !! Digite um numero real !");
                    teclado.next();
                }
            } while (true);
            coef.add(c);
        }

        return (coef);
    }

    static double f(double x, ArrayList<Double> coef) {
        int ord = coef.size() - 1;
        int j = 0;
        double f = 0;
        for (int k = ord; k > -1; k--) {
            f += (coef.get(j)) * (Math.pow(x, k));
            j++;
        }
        return (f);
    }

    static double df(double x, ArrayList<Double> coef) {
        int ord = coef.size() - 1;
        int j = 0;
        double df = 0;
        for (int k = ord - 1; k > -1; k--) {
            df += (coef.get(j)) * (k + 1) * (Math.pow(x, k));
            j++;
        }
        return (df);
    }
    static double bissec(double a, double b, double erro, ArrayList<Double> coef) {
        double xk, xkm1, err;
        do {
            xk = (a + b)/2;
            if ((f(a, coef) * f(xk, coef)) < 0) {
                b = xk;
            } else {
                a = xk;
            }
            xkm1 = (a + b)/2;
            err = (Math.abs(xkm1 - xk))/(Math.abs(xkm1));
        } while (err > erro);
        return (xkm1);
    }

    static double newtonRaphson(double x0, double erro, ArrayList<Double> coef) {
        double xk, xkm1, err;
        xk = x0;
        do {
            xkm1 = x0 - (f(x0, coef))/(df(x0, coef));
            err = (Math.abs(xkm1 - xk))/(Math.abs(xkm1));
            xk = xkm1;
        } while (err > erro);
        return (xkm1);
    }
    static double[] setIntervalo(ArrayList<Double> coef) {
        Scanner teclado = new Scanner(System.in);
        double a, b, erro;
        double[] abe = new double[3];
        do {
            System.out.println("Digite o intervalo:");
            System.out.print("a >> ");
            a = teclado.nextDouble();
            System.out.print("b >> ");
            b = teclado.nextDouble();
        } while (f(a, coef) * f(b, coef) > 0);
        System.out.print("Digite o erro maximo admissivel >> ");
        erro = teclado.nextDouble();

        abe[0] = a; abe[1] = b; abe[2] = erro;
        return (abe);
    }

    static double[] setX0() {
        Scanner teclado = new Scanner(System.in);
        double[] x0erro = new double[2];
        do {
            try {
                System.out.print("Digite o chute inicial >> ");
                x0erro[0] = teclado.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("ERRO !! Digite um numero real !");
                teclado.next();
            }
        } while (true);
        do {
            try {
                System.out.print("Digite o erro maximo admissivel >> ");
                x0erro[1] = teclado.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("ERRO !! Digite um numero real !");
                teclado.next();
            }
        } while (true);
        return (x0erro);
    }

    static double menu(ArrayList<Double> coef) {
        Scanner teclado = new Scanner(System.in);
        int resp;
        System.out.println("Escolha um dos metodos:");
        System.out.println("[1] Bissecao");
        System.out.println("[2] Newton-Raphson");
        do {
            try {
                System.out.print("Escolha >> ");
                resp = teclado.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("ERRO ! Digite 1 ou 2 !");
                teclado.next();
            }
        } while (true);

        double raiz = 0;
        double[] abe, x0erro;
        switch (resp) {
            case 1 -> {
                abe = setIntervalo(coef);
                raiz = bissec(abe[0], abe[1], abe[2], coef);
            }
            case 2 -> {
                x0erro = setX0();
                raiz = newtonRaphson(x0erro[0], x0erro[1], coef);
            }
        }
        return (raiz);
    }

    static void printRaiz(double raiz) {
        System.out.println(" ");
        System.out.printf("Raiz encontrada >> %f", raiz);
    }
    public static void main(String[] args) {
        ArrayList<Double> coef;
        double raiz;
        coef = setEquation();
        raiz = menu(coef);
        printRaiz(raiz);
    }
}
