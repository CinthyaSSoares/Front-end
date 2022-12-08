package sintaxeVariaveisEFluxos;

public class ImpostoDeRenda {
	public static void main(String[] args) {
		
		double salario = 3300.0;
		
		System.out.println("Seu salário é de " + salario);
		
		if( salario <= 1900) {
			System.out.println("Você não precisa pagar imposto de renda");
		}
		else if(salario <= 2800) {
			System.out.println("O seu IR é de 7.5% e pode deduzir na declaração o valor de R$ 142");
		} 
		else if( salario <= 3751) {
			System.out.println("O seu IR é de 15% e pode deduzir R$ 350");
		}
		else if( salario <= 4664) {
			System.out.println("O seu IR é de 22.5% e pode deduzir R$ 636");
		}		
	}
}
