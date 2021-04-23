/* 6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados. */

import java.util.Scanner;

public class tp01ex06 {
    public static void main(String[] args) {
        double a, b, c, d, media;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        a = entrada.nextDouble();
        System.out.print("Digite o segundo valor: ");
        b = entrada.nextDouble();
        System.out.print("Digite o terceiro valor: ");
        c = entrada.nextDouble();
        System.out.print("Digite o quarto valor: ");
        d = entrada.nextDouble();
        media = (a + b + c + d) / 4;
        System.out.print("A média dos quatros valores digitados é: " + media);
        entrada.close();
    }
}
