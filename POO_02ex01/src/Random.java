import java.util.Calendar;

public class Random {
    private final long p = 2147483648L; // final defines that value can not be changed
    private long m = 843314861;
    private long a = 453816693;


    private long xi = 1023;


    public double getRand() {
        xi = (a + m * xi) % p;
        double d = xi;
        //System.out.println(d + " " + xi + " " + d / p);
        return d / p;
    }

    public int getIntRand(int max)
    {
        double d = getRand() * max;
        return (int) d;
    }

    public void setSemente(int semente) {
        xi = semente;
    }

    public Random(int k)
    {
        xi = k;
    }

    public Random() {
        xi = Calendar.getInstance().getTimeInMillis() % p;
    }

    @Override
    public String toString() {
        return xi + "";
    }

    static public void main(String[] args) {
        // Instanciando dois objetos:
        Random rd1 = new Random(23);
        Random rd2 = new Random();      // semente gerada a partir do tempo em millis

        int n1, n2, n;
        int contador = 0;

        while (true) {
            contador++;
            n1 = rd1.getIntRand(500);
            n2 = rd2.getIntRand(500);
            if (n1 == n2) {
                n = n1;
                break;
            }
        }

        System.out.printf("O numero gerado foi %d", n);
        System.out.println(" ");
        System.out.printf("Foram utilizadas %d iteracoes", contador);
    }
}
