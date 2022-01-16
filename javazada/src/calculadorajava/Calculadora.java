package calculadorajava;

import java.util.Scanner;

public class Calculadora {
    public Calculadora() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int a = scan.nextInt();
        System.out.println("Digite outro valor: ");
        int b = scan.nextInt();
        int somar = somar(a, b);
        int subtratir = subtratir(a, b);
        int multiplicar = multiplicar(a, b);
        float dividir = dividir((float)a, (float)b);
        System.out.println("Soma: " + somar);
        System.out.println("Subtração: " + subtratir);
        System.out.println("Divisão: " + dividir);
        System.out.println("Multiplicar: " + multiplicar);
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtratir(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static float dividir(float a, float b) {
        return a / b;
    }
}