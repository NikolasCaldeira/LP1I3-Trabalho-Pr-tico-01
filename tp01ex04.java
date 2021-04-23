/* 4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área. */

import java.util.Scanner;

public class tp01ex04 {
    public static void main(String[] args) {
        double b, h, area;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor da base do triângulo: ");
        b = entrada.nextDouble();
        System.out.print("Digite o valor da altura do triângulo: ");
        h = entrada.nextDouble();
        area = (b * h) / 2;
        System.out.print("A área do triângulo é: " + area);
        entrada.close();
    }
    
}
