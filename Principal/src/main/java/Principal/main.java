package Principal;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o tamanho do quadrado: ");
        String aux = teclado.nextLine();
        int aux1 = Integer.parseInt(aux);
        exercicio1 exe1;
        exe1 = new exercicio1();
        exercicio1.quadrado(aux1);

    }
}
