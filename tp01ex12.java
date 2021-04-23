/* 12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da base que serão digitados. */

import java.util.Scanner;

public class tp01ex12 {
    public static void main(String[] args) {
        double r, h, vol;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dgite o valor do raio do cone: ");
        r = entrada.nextDouble();
        System.out.print("Digite o valor da altura do cone: ");
        h = entrada.nextDouble();
        vol = (Math.PI * Math.pow(r, 2) * h) / 3;
        System.out.print("O volume do cone será: " + vol);
        entrada.close();
    }
}
