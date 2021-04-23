/*15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
        dólares. Calcular e exibir o valor correspondente em Reais (R$).*/

import java.util.Scanner;

public class tp01ex15 {
    public static void main(String[] args) {
        double cot, qtd, vl;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor da cotação do dólar: ");
        cot = entrada.nextDouble();
        System.out.print("Digite a quantidade que deseja converter em reais: ");
        qtd = entrada.nextDouble();
        vl = cot * qtd;
        System.out.print("O valor correspondente será: R$" + vl );
        entrada.close();
    }
}
