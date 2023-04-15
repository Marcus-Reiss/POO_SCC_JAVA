import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Trying primitive types
        int n1 = 23;
        int n2 = (int) 76; // redundant
        // Integer n3 = new Integer(18);

        String the = "the";

        System.out.printf("Here %s first one: %d\n", the, n1);
        // System.out.printf("The others: " + n2 + " %d\n", n3);

        float m1 = 3f;
        float m2 = (float) 32;
        // Float m3 = new Float(4.5);

        // System.out.printf("The float ones: %f %.4f %.2f\n", m1, m2, m3);

        boolean tf = (boolean) true; // redundant

        System.out.print(tf);

        // Input values
        Scanner teclado = new Scanner(System.in);

        System.out.println("\nEnter your name: ");
        String nome = teclado.nextLine();
        System.out.println("Enter your age: ");
        int idade = teclado.nextInt();
        System.out.println("Your height pls: ");
        float artura = teclado.nextFloat();

        System.out.printf("Name: %s\nAge: %d\nHeight: %f\n", nome, idade, artura);

        // Type conversions
        System.out.println("Type an integer: ");
        String ns = teclado.next();
        int nsc = Integer.parseInt(ns);
        System.out.println("Type another integer: ");
        int sn = teclado.nextInt();
        String snc = Integer.toString(sn);

        System.out.printf("String converted into Integer: %d\nInteger converted into String: %s", nsc, snc);
    }
}