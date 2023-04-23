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
}
