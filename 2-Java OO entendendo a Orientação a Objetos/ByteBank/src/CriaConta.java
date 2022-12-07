
public class CriaConta {
	
	public static void main(String[] args) {
		
		// Criando e atribuindo valores nas contas
		
		//Primeira conta
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200; //primeiro saldo
		System.out.println("Valor inicial da primeira conta " + primeiraConta.saldo);
		
		primeiraConta.saldo += 100; //segundo saldo
		System.out.println("Valor atualizado da primeira conta " + primeiraConta.saldo);
		
		//Segunda conta
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50; //primeiro saldo
		System.out.println("Valor inicial da segunda conta " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		System.out.println(segundaConta.agencia);
		
		segundaConta.agencia = 45;
		System.out.println("Agora a segunda conta esta "
		+ "na agencia " + segundaConta.agencia);
		
		// Contas diferentes 
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
	}
}
