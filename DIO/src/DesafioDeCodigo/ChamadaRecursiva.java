//Receba um número inteiro N, calcule e imprima o somatório de todos os números de N até 0.   

package DesafioDeCodigo;

import java.util.Scanner;

public class ChamadaRecursiva {

    public static void main(String[] args) {
        
        int N, qtda;

        Scanner input = new Scanner(System.in);

        //System.out.println("Digite o seu número: ");
        N = input.nextInt();
        qtda = 0;

        while(! (N == 0)){
            qtda = qtda + N;
            N--;
        }
        
        System.out.println(qtda);

    }
    
}
