import java.lang.reflect.Array;
import java.util.Scanner;

public class ex6_fatorial {
    
    /*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");        
        int fatorial = scan.nextInt();
        
        int multiplicacao = 1;
        
        for(int i = fatorial;i >= 1; i--) {
            multiplicacao = multiplicacao * i;    
        }

        System.out.println("resultado de " + fatorial + "! = " + multiplicacao);        

    }
}
