/*17. Entrar via teclado com dois valores quaisquer X e Y. Calcular e exibir o
    cálculo XY (X elevado a Y). Pesquisar as funções Exp e Ln.*/

import java.util.Scanner;

public class tp01ex17 {
    public static void main(String[] args) {
        double x, y, xy;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        x = entrada.nextDouble();
        System.out.print("Digite o segundo valor: ");
        y = entrada.nextDouble();
        xy = Math.pow(x, y);
        System.out.print("O valor de " + x + " elevado a " + y + " será: " + xy);
        entrada.close();
    }
}
