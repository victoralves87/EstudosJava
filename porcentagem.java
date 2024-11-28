package softex.exercicios;

import java.util.Scanner;

public class porcentagem {
    public static void main(String[] args) {
        Double numero, numero2, porcento,result;

        Scanner scan = new Scanner(System.in);

        System.out.println("digite um numero para saber a porcentagem dele: ");
        numero= scan.nextDouble();
        System.out.println("digite  a porcentagem dele: ");
        numero2= scan.nextDouble();
        porcento = numero2 / 100;
        result = (porcento * numero) ;

        System.out.println(result);
    }
}
