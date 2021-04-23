/*9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
    valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.*/

import java.net.SocketPermission;
import java.util.Scanner;

public class tp01ex09 {
    public static void main(String[] args) {
        double r, i, v;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor da resistência: ");
        r = entrada.nextDouble();
        System.out.print("Digite o valor da corrente: ");
        i = entrada.nextDouble();
        v = r * i;
        System.out.print("O valor da tensão do circuito será: " + v + "V");
        entrada.close();
    }
}
