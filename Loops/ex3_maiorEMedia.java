import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class ex3_maiorEMedia {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int bigger = 0;
        int sum = 0;

        int count = 0;

        do {
            System.out.println("Number: ");
            numero = scan.nextInt();

            sum = sum + numero;

            if (numero > bigger ) bigger = numero;

            count = count + 1;
        } while(count<5);

        System.out.println("bigger: " + bigger);
        System.out.println("average: " + sum/5);


    }
}
