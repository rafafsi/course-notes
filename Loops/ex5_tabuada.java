import java.util.Scanner;

/* Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
*/

public class ex5_tabuada {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("tabuada de: " + tabuada);
        for(int i = 1; i < 10; i = i + 1) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }

        
    }
}
