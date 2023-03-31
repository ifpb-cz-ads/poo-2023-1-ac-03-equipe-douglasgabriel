public class BMExercicio03{
	public static void main(String[] args) {
		final double taxa = 0.0825; // declarando a constante texa
		double valorSuco = 2.95, valorLanche = 3.50; // declarando o valor de cada produto (usei "suco" e "lanche" como exemplo)
		System.out.print("O lanche custa: " + valorLanche + "\nO suco custa: \n" + valorSuco);// imprimindo o valor de cada produto separadamente
		double total = valorLanche + valorSuco;//total da soma entre os dois produtos 
		System.out.println("Valor total: "+total);//imprimindo o resultado 
		double taxaCalculada = total + (taxa*total);// calculando uma taxa em cima do total 
		System.out.printf("Valor com taxa: %.2f\n",taxaCalculada);//imprimindo o resultado 
		valorSuco += valorSuco*taxa; valorLanche += valorLanche*taxa;//calculando a taxa em cada produto separadamente
		double novoCusto = valorLanche + valorSuco;//somando os resultados
		boolean muitoCaro = (novoCusto > 10);//condicional que será "true" se for maior que 10, e "false" caso contrário
		System.out.println(muitoCaro);//imprimindo o resultado
	}
}