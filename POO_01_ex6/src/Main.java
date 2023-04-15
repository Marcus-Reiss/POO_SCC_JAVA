import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static ArrayList<Float> setFloat() {
        Scanner teclado = new Scanner(System.in);
        float nn = 1f;
        ArrayList<Float> n = new ArrayList<Float>();
        do {
            try {
                System.out.print("Digite um numero real (0 para sair) >> ");
                nn = teclado.nextFloat();
                n.add(nn);
            } catch (Exception e) {
                System.out.println("ERRO! Digite um numero real !!");
                teclado.next();
            }
        } while (nn != 0);
        return (n);
    }

    static float[] maiorMenor(ArrayList<Float> n) {
        float menor, maior;
        float[] mM = new float[2];
        menor = maior = n.get(0);
        for (int k = 1; k < n.size() - 1; k++) {
            if (menor > n.get(k)) {
                menor = n.get(k);
            } else if (maior < n.get(k)) {
                maior = n.get(k);
            }
        }
        mM[0] = menor;
        mM[1] = maior;
        return (mM);
    }

    static void impMenorMaior(float[] mM) {
        System.out.printf("Menor: %f", mM[0]);
        System.out.println(" ");
        System.out.printf("Maior: %f", mM[1]);
    }
    public static void main(String[] args) {
        ArrayList<Float> n = new ArrayList<Float>();
        float[] mM = new float[2];
        n = setFloat();
        mM = maiorMenor(n);
        impMenorMaior(mM);
    }
}
