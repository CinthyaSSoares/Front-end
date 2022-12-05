package sintaxeVariaveisEFluxos;

public class TestaPontoFlutuante {
	
	public static void main(String[] args) {
		
		double salario;
		salario = 1250.70;		
		System.out.println( "Meu salário é $" + salario);
		
		double descontoDoValeTransporte =  salario % 3;
		System.out.println(" Valor do desconto em % do vale transporte é de $" + descontoDoValeTransporte);
		
		int divisao = 5/2;	
		System.out.println("Dividindo 5/2 com int = " + divisao);
		
		double outraDivisao = 5.0 / 2;
		System.out.println("Dividindo 5.0 /2 com double = " + outraDivisao);
		
	}

}
