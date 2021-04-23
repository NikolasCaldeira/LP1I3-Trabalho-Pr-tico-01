//*3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será digitado.*//

import java.util.Scanner;

public class tp01ex03 {
    public static void main(String[] args) {
        double d, area;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor da diagonal do quadrado: ");
        d = entrada.nextDouble();
        area = (Math.pow(d, 2)) / 2;
        System.out.print("A área do quadrado é: " + area);
        entrada.close();
    }
}
