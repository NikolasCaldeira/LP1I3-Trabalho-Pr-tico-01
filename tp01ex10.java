/* 10. Entrar via teclado com o valor de uma temperatura em graus Celsius, 
    calcular e exibir sua temperatura equivalente em Fahrenheit. */

import java.util.Scanner;

public class tp01ex10 {
   public static void main(String[] args){
       double c, f;
       Scanner entrada = new Scanner(System.in);
       System.out.print("Digite o valor da temperatura em ºc : ");
       c = entrada.nextDouble();
       f = (c * 9/5) + 32;
       System.out.print("A temperatura de " + c + "ºc em Fahrenheint é: " + f);
       entrada.close();
   } 
}