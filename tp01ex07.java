//*7. Calcular e exibir a média geométrica de dois valores quaisquer que serão digitados.*//

import java.util.Scanner;

public class tp01ex07 {
    public static void main(String[] args) {
        double v1, v2, media;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        v1 = entrada.nextDouble();
        System.out.print("Digite o segundo valor: ");
        v2 = entrada.nextDouble();
        media = Math.sqrt(v1 *v2);
        System.out.print("A média geométrica dos valores digitados será: " + media);
        entrada.close();
    }
}
