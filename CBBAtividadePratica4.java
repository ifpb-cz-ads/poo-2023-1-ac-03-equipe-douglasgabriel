/**
 * Crie um programa que elabore o orçamento de uma construtora para o cálculo do 
 * valor total de construção de uma piscina. O valor total será dado pela cubagem
 *  da piscina (metros cúbicos) multiplicada por R$100,00, que é o preço do metro
 *  cúbico construído de piscina. Faça a simulação dos cálculos no programa para
 *  ver se está tudo funcionando corretamente.
 */

import java.util.Scanner; /* Importando a propriedade para possibilitar a entrada de dados */

public class CBBAtividadePratica4{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); /*Selecionando a variavel ler */

        int metro_cubico = 100; /* Valor do metro cúbico */

        /* Variaveis de controle do calcúlo da cubagem da piscina */
        float comprimento; 
        float altura;
        float largura;

        /* Entrada de dados e atribuição de valores às variáveis */
        System.out.println("Informe o comprimento da piscina: ");
        comprimento = ler.nextFloat();
        System.out.println("Informe a altura da piscina: ");
        altura = ler.nextFloat();
        System.out.println("Informe a largura da psicina: ");
        largura = ler.nextFloat();

        /*Exercução das operações aritméticas de cubagem e de calculo do valor final */
        float cubagem = comprimento*altura*largura;
        float valorFinal = cubagem*metro_cubico;
        
        /* Imprimindo o valor final na tela */
        System.out.println("A piscina terá como valor final: " + valorFinal + " R$");
    }
}