/* 14. Calcular e exibir o volume livre de um ambiente que contém
    uma esfera de raio “r” inscrita em um cubo perfeito de aresta “a”. 
    Os valores de “r“ e “a” serão digitados. */

import java.util.Scanner;

public class tp01ex14 {
    public static void main(String[] args) {
        double a, r, vl;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor da aresta do cubo: ");
        a = entrada.nextDouble();
        System.out.print("Digite o valo do raio da esfera: ");
        r = entrada.nextDouble();
        vl = Math.pow(a, 3) - Math.pow(r, 3) * Math.PI * 4 / 3;
        System.out.print("O volume livre no ambiente será: " + vl);
        entrada.close();
    }
}
