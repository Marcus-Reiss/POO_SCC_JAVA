import java.util.InputMismatchException;
import java.util.Scanner;

public class Senha {
    static Scanner teclado = new Scanner(System.in);
    int max;
    public Senha () {
        max = setMax();
        Random rd = new Random();
        int senha = rd.getIntRand(max);
        jogo(senha);
    }

    public static int setMax () {
        int n;
        while (true) {
            try {
                System.out.print("Digite o numero maximo para a senha >> ");
                n = teclado.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Tente novamente ! Digite um INTEIRO !");
                teclado.next();
            }
        }
        linha();
        return (n);
    }

    public static void jogo (int senha) {
        System.out.println("JOGO: Tente acertar a senha !");
        linha();

        int chute;
        int tentativas = 0;

        while (true) {
            tentativas++;
            chute = chute();
            if (chute == senha) {
                analisaChute(chute, senha);
                break;
            }
            analisaChute(chute, senha);
        }
        System.out.printf("Voce precisou de %d tentativas", tentativas);
        System.out.println(" ");
        linha();
    }

    public static int chute () {
        linha();
        int chute;
        while (true) {
            try {
                System.out.print("Seu chute >> ");
                chute = teclado.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Tente novamente ! Digite um INTEIRO !");
                teclado.next();
            }
        }
        return (chute);
    }

    public static void analisaChute (int chute, int senha) {
        if (chute < senha)
            System.out.printf("O valor %d eh MENOR que a senha ! Tente novamente !", chute);
        else if (chute > senha)
            System.out.printf("O valor %d eh MAIOR que a senha ! Tente novamente !", chute);
        else {
            System.out.println("Parabens !! Voce acertou a senha !!");
            linha();
        }
        System.out.println(" ");
    }

    public static void linha () {
        for (int k = 0; k < 70; k++)
            System.out.print("-");
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Senha obj = new Senha();
    }
}
