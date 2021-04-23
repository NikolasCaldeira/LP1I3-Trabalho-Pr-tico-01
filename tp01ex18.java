/* 18. Entrar via teclado com o valor de cinco produtos. Após as entradas, 
    digitar um valor referente ao pagamento da somatória destes valores. 
    Calcular e exibir o troco que deverá ser devolvido. */

import java.util.Scanner;

public class tp01ex18 {
    public static void main(String[] args) {
        double v1, v2, v3, v4, v5, pg, tr;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dgite o valor do primeiro produto: ");
        v1 = entrada.nextDouble();
        System.out.print("Dgite o valor do segundo produto: ");
        v2 = entrada.nextDouble();
        System.out.print("Dgite o valor do terceiro produto: ");
        v3 = entrada.nextDouble();
        System.out.print("Dgite o valor do quarto produto: ");
        v4 = entrada.nextDouble();
        System.out.print("Dgite o valor do quinto produto: ");
        v5 = entrada.nextDouble();
        System.out.print("Digite o valor do pagamento: ");
        pg = entrada.nextDouble();
        tr = pg - (v1 + v2 + v3 + v4 + v5);
        System.out.print("o troco será de: R$" + tr);
        entrada.close();
    }
}
