import java.util.Scanner;

/**
 * ex4_parEImpar: Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares
 * e a quantidade de números impares.
 */
public class ex4_parEImpar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("quantidade de numeros: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("numero: ");
            numero = scan.nextInt();
            //count = count + 1;
            count++;

            if (numero % 2 == 0)
                quantPares++;
            else
                quantImpares++;

        } while (count < quantNumeros);

        System.out.println("quant. pares: " + quantPares);
        System.out.println("quant. impares: " + quantImpares);
    }
}