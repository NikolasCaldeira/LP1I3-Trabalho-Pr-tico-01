/* 16. Entrar via teclado com o valor de um ângulo em graus, 
    calcular e exibir as seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo. 
    Lembre-se que uma função trigonométrica trabalha em radianos. */

import java.util.Scanner;

public class tp01ex16 {
    public static void main(String[] args) {
        double r, s, c, t, se;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor do ângulo: ");
        r = entrada.nextDouble();
        r = (r * Math.PI) / 180;
        s = Math.sin(r);
        c = Math.cos(r);
        t = Math.tan(r);
        se = 1 / c;
        System.out.println("O seno de " + r + " radianos é: " + s);
        System.out.println("O coseno de " + r + " radianos é: " + c);
        System.out.println("A tangente de " + r + " radianos é: " + t);
        System.out.println("A secante de " + r + " radianos é: " + se);
        entrada.close();

    }
}
