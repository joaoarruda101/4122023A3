package A3;

import java.util.Scanner;

public class codigo {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o primeiro valor binário: ");
    String valor1 = scanner.nextLine();
    System.out.print("Digite a operação (+, -, *, /): ");
    String operacao = scanner.nextLine();
    System.out.print("Digite o segundo valor binário: ");
    String valor2 = scanner.nextLine();

    int resultado = 0;

    if (operacao.equals("+")) {
        if(valor1.contains(0) || valor2.contains(1)){
            resultado = Integer.parseInt(valor1, 2) + Integer.parseInt(valor2, 2);
        }else{
            System.out.print("Isso não é um número binário");
        }
    } else if (operacao.equals("-")) {
        if(valor1.contains(0) || valor2.contains(1)){
            resultado = Integer.parseInt(valor1, 2) - Integer.parseInt(valor2, 2);
        }else{
            System.out.print("Isso não é um número binário");
        }
    } else if (operacao.equals("*")) {
        if(valor1.contains(0) || valor2.contains(1)){
            resultado = Integer.parseInt(valor1, 2) * Integer.parseInt(valor2, 2);
        }else{
            System.out.print("Isso não é um número binário");
        }
    } else if (operacao.equals("/")) {
        if(valor1.contains(0) || valor2.contains(1)){
            resultado = Integer.parseInt(valor1, 2) / Integer.parseInt(valor2, 2);
        }else{
            System.out.print("Isso não é um número binário");
        }
    } else {
        System.out.println("Operação inválida.");
        return;
    }

    System.out.println("Resultado binário: " + Integer.toBinaryString(resultado));
}
}
