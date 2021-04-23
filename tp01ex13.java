/*13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
    valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
    (em s) que serão digitados.*/

import java.util.Scanner;

public class tp01ex13 {
    public static void main(String[] args) {
        double vi, a, t, vf;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor da velocidade inicial em m/s: ");
        vi = entrada.nextDouble();
        System.out.print("Digite o valor da aceleração em m/s²: ");
        a = entrada.nextDouble();
        System.out.print("Digite o tempo do percurdo em s: ");
        t = entrada.nextDouble();
        vf = (vi + (a * t)) * 3.6;
        System.out.print("A velocidade final do será: " + vf + "Km/h");
        entrada.close();
    }
}
