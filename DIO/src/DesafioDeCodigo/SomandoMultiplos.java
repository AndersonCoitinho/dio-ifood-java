//Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.

package DesafioDeCodigo;

import java.util.Scanner;

public class SomandoMultiplos {

    public static void main(String[] args) {
        int A, N, count, qtda, result;

        Scanner input = new Scanner(System.in);

        //System.out.println("Digite o primeiro número: ");
        A = input.nextInt();
        //System.out.println("Digite o número limite: ");
        N = input.nextInt();
        qtda = A + A;
        count = 1;
        result = 0;

        while (qtda <= N) {
            qtda = qtda + A;
            count++;
        }

        result = count * (A + N) / 2;

        System.out.println(result);
    }
}
