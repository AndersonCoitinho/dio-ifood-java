//Imprima se os valores numéricos passados são iguais ou não.

package DesafioDeCodigo;

import java.util.Scanner;

public class NumerosIguais {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
      int a;
      int b;

      // System.out.println("Digite o primeiro número: ");
      a = scan.nextInt();
      // System.out.println("Digite o segundo número: ");
      b = scan.nextInt();

      if (a == b) {
        System.out.println("Sao iguais!");
      } else {
        System.out.println("Nao sao iguais!");
      }
    
  }
}
