package CaixaEletronico;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Sistema {
   private String nome;
    private int idade;
    private double saldo;
    public void abrirConta(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, Seja bem-vindo!");
        System.out.println("Poderia nos informar seu nome e sua idade para darmos continuidade ao seu atendimento...");
        System.out.print("Nome: ");
        nome = scanner.nextLine();
        System.out.print("Idade: ");
        idade = scanner.nextInt();
        System.out.println("Você já é nosso cliente?");
        System.out.println("'S' caso já seja nosso cliente e 'N' caso ainda não seja e gostaria de se cadastrar..");
        System.out.println("S ou N : ");
        String resposta = scanner.next();

        switch (resposta){
            case "S" :
                System.out.println("Vamos acessar sua conta agora...");
                System.out.println("Seja bem-vindo " + nome + "\n");
                acessarConta();
                break;
            case "N" :
                if (idade < 18){
                    System.out.println("Nos desculpe, mas você ainda não pode abrir uma conta.");
                }else {
                    System.out.println("Vamos dar continuidade abrindo sua conta, Sr." + nome);
                    cadastrarCliente();
                    break;
                }
            default:
                System.out.println("Escolha uma opção válida.");
                break;
        }
    }

    public void acessarConta(){
        Scanner scanConta = new Scanner(System.in);

        boolean contaEmUso = true;
        while (contaEmUso == true) {

         //   System.out.println("Você acessou a conta \n ");
            System.out.println("Oque você gostaria de fazer : ");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("0 - Fechar");

            int opcao = scanConta.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo atual é: " + saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor para sacar: ");
                    double saque = scanConta.nextDouble();
                    if (saque < saldo) {
                        saldo -= saque;
                        System.out.println("Saldo atual: " + saldo);
                    } else {
                        System.out.println("Você não pode realizar saque, saldo insuficiente... ");
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor para efetuar um depósito: ");
                    double depositar = scanConta.nextDouble();
                    saldo += depositar;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Obrigado por utilizar nosso Caixa Eletronico, até mais.");
                    contaEmUso = false;
                    break;
                default:
                    System.out.println("Escolha inválida...");
                    break;
            }
        }
        scanConta.close();
    }
    public void cadastrarCliente(){
        Scanner scanCadastro = new Scanner(System.in);

        double deposito;

        System.out.println("Você iniciou o processo de cadastro");
        System.out.println("Escreva seu nome completo, idade e quanto gostaria de depositar na sua conta");
        System.out.print("Nome: ");
        nome = scanCadastro.nextLine();
        System.out.print("Idade: ");
        idade = scanCadastro.nextInt();
        System.out.print("Depositar: ");
        deposito = scanCadastro.nextDouble();
        saldo += deposito;

        System.out.println("Parabéns e obrigado por ser um novo cliente..");
        System.out.println("Seja bem-vindo Sr. " + nome);
        System.out.println("Você deseja acessar sua conta ou encerrar o atendimento? ");
        System.out.println("Digite 'A' para acessar sua conta e 'E' caso deseje encerrar o atendimento...");
        String opcao = null;

        while (opcao != "A" || opcao != "E") {

            opcao= scanCadastro.next();

            switch (opcao) {
                case "A":
                    System.out.println("Vamos te direcionar para conta, obrigado.");
                    acessarConta();
                    break;
                case "E":
                    System.out.println("Obrigado por utilizar nosso sistema, até mais.");
                    break;
                default:
                    System.out.println("Por favor digite uma opção válida.");
                    break;
            }
        }
        scanCadastro.close();
    }
}
