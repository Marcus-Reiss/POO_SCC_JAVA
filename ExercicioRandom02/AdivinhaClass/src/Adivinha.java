import java.util.InputMismatchException;
import java.util.Scanner;

public class Adivinha {
    static Scanner teclado = new Scanner(System.in);
    int max;
    public Adivinha () {
        max = setN();
    }

    public static int setN () {
        int n;
        while (true) {
            try {
                System.out.print("Digite o valor do extremo superior do intervalo >> ");
                n = teclado.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Tente novamente ! Digite um INTEIRO !");
                teclado.next();
            }
        }
        return (n);
    }

    public static void adivinha () {
        while (true) {

        }
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}