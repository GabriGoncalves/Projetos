package Calculadora;

import java.util.Scanner;

public class Calculadora {

    private boolean menu = true;

    private double somar(double num1, double num2 ){
        return num1 + num2;
    }
    private double subtracao(double num1, double num2){
        return num1 - num2;
    }
    private double multiplicacao(double num1, double num2){
        return num1 * num2;
    }
    private double divisao(double num1,double num2){
        if(num2 == 0){
            System.out.println("ERRO: não pode ser feita divisão por 0..");
            return Double.NaN;
        }else {
            return num1 / num2;
        }
    }

    public void iniciarCalculadora(){
        Scanner escrever = new Scanner(System.in);

        while(menu == true){
            System.out.println("!!! Calculadora !!!");
            System.out.println("Escolha uma das opções abaixo para iniciar sua operação...");
            System.out.println("1 - SOMA (+)");
            System.out.println("2 - Subtração (-)");
            System.out.println("3 - Multiplicação (*)");
            System.out.println("4 - Divisão (/)");
            System.out.println("0 - Encerrar calculadora");
            System.out.print("OPÇÃO : ");

            int opcao = escrever.nextInt();

            if (opcao == 0){
                menu = false;
                System.out.println("Obrigado por utilizar a Calculadora");
                System.out.println("Encerrando...");
                break;
            } else {

                System.out.print("Digite o primeiro número: ");
                double num1 = escrever.nextDouble();

                System.out.print("Digite o segundo número: ");
                double num2 = escrever.nextDouble();

                double resultado = 0;
                boolean operacaoValida = true;

                switch (opcao){
                    case 1 :
                        resultado = somar(num1, num2);
                        break;
                    case 2 :
                        resultado = subtracao(num1, num2);
                        break;
                    case 3 :
                        resultado = multiplicacao(num1,num2);
                        break;
                    case 4 :
                        resultado = divisao(num1,num2);
                        break;
                    default:
                        System.out.println("Por favor, digite um número válido na proxima vez.");
                        operacaoValida = false;
                }
                if (operacaoValida == true){
                    System.out.println("Resultado: " + resultado);
                }
            }
        }

    }

}
