/**
 * Crie um programa e declare nele 3 variáveis numéricas int, inicializando-as com algum 
 * valor e obtenha a soma dessas variáveis e a média delas, imprimindo esses resultados na tela.
 */

public class CBBAtividadePratica2{
    public static void main(String[] args) {
        /* Criando as váriaveis com um valor qualquer */
        int numero1 = 2;
        int numero2 = 3;
        int numero3 = 5;

        /* Criando duas variaveis para receber o resultado das operações numéricas */
        int soma = numero1+numero2+numero3;
        float media = soma/3f; /*O uso do "f" ao fim da operação, foi usado para identificar o valor recebido pela variavel como um float  */
       
        /* Imprimindo os resultados das operações númericas */
        System.out.println("A soma dos números, é: "+ soma);
        System.out.println("A média dos números, é: "+ media);
    }

}