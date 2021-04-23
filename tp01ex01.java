//*1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.*//

import java.util.Scanner;

public class tp01ex01 {

public static void main(String[] args) {
    double b, a, area;
    Scanner entrada = new Scanner (System.in);
    System.out.print("Digite o valor da base: ");
    b = entrada.nextDouble();
    System.out.print("Digite o valor da altura: ");
    a = entrada.nextDouble();
    area = b * a;
    System.out.println("A area do retângulo será: " + area);
    entrada.close();
    }
}