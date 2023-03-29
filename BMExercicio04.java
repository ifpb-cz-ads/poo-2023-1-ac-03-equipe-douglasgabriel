/*
 * Declare uma variável chamada long1 do tipo long e a inicialize com 100.
 *  Agora declare duas variáveis do tipo int, int1 e int2, e inicialize int1 com 200.
 *  Agora faça int2 receber int1 mais long1 e explique os resultados. 
 * Arrume o código para que não ocorra o erro anterior.
 */

public class BMExercicio04 {
    public static void main(String[] args) {
        long long1 = 100;
        int int1 = 200;
        int int2 = int1 + (int)long1;

        /**
         * int int2 = int1 + long1;
         * O trecho de ccódigo, resultaria em um erro, tendo em vista que o compilador
         * tentaria converter o tipo "long" implícitamente  em "float" ou em "double".
         * Utilizando o 'casting' o tipo "long" é explícitamente convertido em "int", 
         * sendo assim, resolvendo o problema e compilando o código.
         */

        System.out.println("O resultado do int2 eh: " + int2);

    }
}
