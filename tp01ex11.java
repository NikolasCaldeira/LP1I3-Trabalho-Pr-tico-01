//*11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.*//

import java.util.Scanner;

public class tp01ex11 {
    public static void main(String[] args) {
        double d, a;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor do diâmetro do circulo: ");
        d = entrada.nextDouble();
        a = (Math.pow(d, 2) * Math.PI);
        System.out.print("A área do circulo será: " + a);
        entrada.close();
    }
}
