import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(in);
        double numero1, numero2;
        double resposta = 0;
        char opcao;

        out.println ("+-----------------+");
        out.println ("| Calculadora |");
        out.println ("+-----------------+");
        out.println ("| 7 8  9 |");
        out.println ("| 4 5  6 |");
        out.println ("| 1 2  3 |");
        out.println ("+-----------------+");
        out.println ("| + - * / |");
        out.println ("+-----------------+");

        try{
            out.print ("Digite o primeiro numero: ");
            numero1 = sc.nextDouble();

            out.print ("Digite a opcao: ");
            opcao = sc.next().charAt(0);

            out.print ("Digite o segundo numero: ");
            numero2 = sc.nextDouble();

            switch (opcao){
                case '+':
                    resposta = numero1 + numero2;

                    out.println("Adicao: " + resposta);
                    break;
                case '-':
                    resposta = numero1 - numero2;

                    out.println("Subtracao: " + resposta);
                    break;
                case '*':
                    resposta = numero1 * numero2;

                    out.println("Multiplcao: " + resposta);
                    break;
                case '/':

                    if (numero2 == 0)
                    {
                        throw new ArithmeticException("Numero invalido divisao por zero.");
                    }
                    else
                    {
                        resposta = numero1 / numero2;
                    }

                    out.println("Divisao: " + resposta);
                    break;
                default:
                    out.println("Opcao invalida!");
                    break;
            }

        }
        catch (Exception e)
        {
            out.println ("Erro: " + e);
        }
    }
}