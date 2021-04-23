//*5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado.*//

import java.util.Scanner;

public class tp01ex05 {
    public static void main(String[] args) {
        double d, v;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor do diâmetro da esfera: ");
        d = entrada.nextDouble();
        v = Math.pow(d, 3) * Math.PI * 4 / 3;
        System.out.print("O volume da esfera será: " + v);
        entrada.close();
    }
}
