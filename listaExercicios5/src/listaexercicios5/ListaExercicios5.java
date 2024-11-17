/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaexercicios5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author kawan
 */
public class ListaExercicios5 {

    /**
     * @param args the command line arguments
     */
    static double real1, real2;
    static Scanner s = new Scanner(System.in);
    static String[][] M1;
    static int[] inteiro;
    static String insira;

    public static void main(String[] args) {
        System.out.println("exercicio 1");

        /*execicio 1 */
        System.out.println("informe dois numeros para a divisao ");
        System.out.println(  divisao( real1 = s.nextInt(), real2 = s.nextInt()) );
         
        
        System.out.println("\n\n\n\n exercicio 2");
     //exercicio2
     imprime_vetor_();
        System.out.println("\n\n\n\n exercicio 3");

   //exercicio3
        imprime_vetor_string();
        System.out.println("\n\n\n\n exercicio 4");
     
 //exercicio4
        ordena_vetor(inteiro);
   
 System.out.println("\n\n\n\n exercicio 5");
 //exercicio5
        matrizsomaLinha();
 System.out.println("\n\n\n\n exercicio 6");
 //exercicio6
 matrizsomacoluna();
 System.out.println("\n\n\n\n exercicio 7");
 
        VerificaCaracter(insira);
 
 System.out.println("\n\n\n\n exercicio 8");
        ncm();
 System.out.println("\n\n\n\n exercicio 9");
 
        System.out.print("Digite um nome: ");
        String nome = s.next();
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = s.nextInt();
        String nomeTransformado = transformarNome(nome, anoNascimento);
        System.out.println("Nome original: " + nome);
        System.out.println("Ano de nascimento: " + anoNascimento);
        System.out.println("Nome transformado: " + nomeTransformado);
 System.out.println("\n\n\n\n exercicio 10"
         + "");
 exercicio10();
         
    }

    public static double divisao(double d1, double d2) {
        /*        
        1. Crie uma função chamada divisão, com retorno real e que receba
        dois valores por parâmetros. Se o divisor for igual a 0, ela deve retornar 0.
        Se não, deve retornar a divisão entre eles. 

         */
        if (d1 == 0 || d2 == 0) {
            return 0;
        } else {
            return d1 / d2;
        }

    }

    /*2. Crie uma função chamada imprime_vetor_int que receba um vetor de inteiro por
    parâmetro e faça a impressão na tela do vetor. 
     */
    public static void imprime_vetor_() {
        int inteiro[] = new int[5];
        inteiro[0] = 0;

        for (int i = 0; i < 5; i++) {
            inteiro[i] = i;

        }
        for (int i = 0; i < 5; i++) {
            System.out.println(inteiro[i] + 1);
        }

    }

    /*
    3. Crie uma função chamada imprime_vetor_string que receba uma matriz de String
    por parâmetro e imprima os valores em tela. 
     */
    public static void imprime_vetor_string() {
        String vetS[][] = new String[2][2];
        vetS[0][0] = "a";
        vetS[0][1] = "a";
        vetS[1][0] = "a";
        vetS[1][1] = "a";
        //vetS[1][2] = "a";
        //vetS[2][0] = "a";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(vetS[i][j]);
            }
        }
    }

    /*ex4. Crie uma função chama ordena_vetor que receba um vetor de inteiros
    e retorne um vetor de inteiros em ordem crecente. 
     */
    public static int[] ordena_vetor(int[] ordem) {
        System.out.println("informe 4 numeros para colocalos em ordem ");
        ordem = new int[4];
        for (int i = 0; i < 4; i++) {
            ordem[i] = s.nextInt();

        }
        for (int i = 0; i < 4; i++) {
            Arrays.sort(ordem);
            System.out.println(ordem[i]);
        }

        return ordem;
    }

    /*5. Crie uma função que receba uma matriz e escreva na tela a soma de cada linha da mesma.*/
    public static void matrizsomaLinha() {
        System.out.println("informe 4 numeros");
       
        int[][] somaLinha = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                somaLinha[i][j] = s.nextInt();
            }
        }
        int soma = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                soma += somaLinha[i][j];
                System.out.println("soma linhas matriz "+soma);
                if (j == 1) {
                    soma = 0;

                }
            }
        }
    }

    /*6. Crie uma função que receba uma matriz e escreva na tela a soma de cada coluna da mesma. */
    public static void matrizsomacoluna() {
        System.out.println("informe 4 numeros");
        int[][] somaLinha = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                somaLinha[i][j] = s.nextInt();
            }
        }
        int soma = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                soma += somaLinha[j][i];
                System.out.println("soma colunas matriz "+soma);

                if (j == 1) {
                    soma = 0;

                }
            }
        }
    }

    /*7. Crie uma função que peça um nome de um produto ao usuário,
    verifique se esse nome possui ao menos 10 caracteres e retorne o
    nome somente se o nome for valido.
     */
    public static void trans() {
        transformarNome(insira, 0);
        System.out.println("nome");
        String nome = s.next();
        System.out.println("ano");
        int anoNascimento = s.nextInt();
        String nomeTransformado = transformarNome(nome, anoNascimento);
        System.out.println("Nome original: " + nome);
        System.out.println("Ano de nascimento: " + anoNascimento);
        System.out.println("Nome transformado: " + nomeTransformado);
    }

    public static String VerificaCaracter(String produto) {
        System.out.println("informe um produto de 10 caracteres");
        produto = s.next();
        if (produto.length() < 10) {
            System.out.println("o " + produto + " e um produto invalido");

        } else {
            System.out.println("o " + produto + " e um produto valido");
        }
        return produto;
    }

    /*ncm */
    public static void ncm() {

        System.out.println("NCM cadastrados \n- 8471.30.12 ");
        System.out.println("- 8517.12.31 ");
        System.out.println("- 8471.50.10 ");
        System.out.println("- 8517.62.59 ");
        System.out.println("- 8523.51.90 ");
        System.out.println("- 0101.21.00");
        System.out.println("- 1001.19.00");
        System.out.println("- 2001.90.00");
        System.out.println("- 3304.99.10");
        System.out.println("- 4011.20.90");
        System.out.println("informe um ncm");
        String verificaNcm = s.next();

        if (verificaNcm.equals("8471.30.12")) {
            System.out.println("(Maquinas automaticas para processamento de dados, portateis) e relacionado a informatica");
        } else if (verificaNcm.equals("8517.12.31")) {
            System.out.println("(Smartphones)e relacionado a informatica");
        } else if (verificaNcm.equals("8471.50.10")) {
            System.out.println("(Unidades de processamento de dados) e relacionado a informatica");
        } else if (verificaNcm.equals("8517.62.59")) {
            System.out.println("(Equipamentos de rede) e relacionado a informatica");
        } else if (verificaNcm.equals("8523.51.90")) {
            System.out.println("(Dispositivos de armazenamento nao volatil) e relacionado a informatica");
        } else {
            System.out.println("o produto nao e relacionado a informatica");
        }

    }

    /*exercicio 9 */
    public static String transformarNome(String nome, int anoNascimento) {
        if (isNumeroPrimo(anoNascimento)) {
            nome = nome.replace('A', '@').replace('E', '!');
            nome = nome.replace('a', '@').replace('e', '!');
        } else {
            nome = nome.replace('E', '#').replace('O', '*');
            nome = nome.replace('e', '#').replace('o', '*');
        }
        return nome;
    }

    public static boolean isNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void exercicio10() {
        String[][] alunos = {
            {"Kawan dos Reis", "60002078"},
            {"Victor Hugo", "6000092"},
            {"Adrian Gabriel Moraes", "60001083"}};
        System.out.print("Digite parte do nome do aluno para busca: ");
        String textoBusca = s.nextLine();
        String[][] alunosEncontrados = busca_aluno(alunos, textoBusca);
        imprime_matriz(alunosEncontrados);
    }

    public static String[][] busca_aluno(String[][] alunos, String texto) {
        List<String[]> resultado = new ArrayList<>();
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i][0].toLowerCase().contains(texto.toLowerCase())) {
                resultado.add(alunos[i]);
            }
        }
        String[][] arrayResultado = new String[resultado.size()][2];
        return resultado.toArray(arrayResultado);
    }

    public static void imprime_matriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}
