package softex.exercicios;

import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {

        double c,f;
        Scanner scan = new Scanner(System.in);

        System.out.println("-----------conversão de medidas----------");
        System.out.println("digite a temperartura em fahrenheit: ");
        f = scan.nextDouble();

        c = (5 * (f-32)) / 9;
        String formatado = String.format("%.2f", c);
        System.out.println("a temperatura em Celcius é: " + formatado + "°");

    }
}
