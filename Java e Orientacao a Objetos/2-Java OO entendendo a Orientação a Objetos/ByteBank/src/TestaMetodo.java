
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaAna = new Conta();
		
		contaAna.saldo = 100;
		System.out.println("Conta da Ana saldo: $" + contaAna.saldo);
		
		contaAna.deposita(50);
		
		System.out.println("Conta da Ana saldo após depositar: $" 
		+ contaAna.saldo);
		
		contaAna.saca(20);
		System.out.println("Saldo após saque $" + contaAna.saldo);
		
		//Outra conta
		
		Conta contaLucy = new Conta();
		
		contaLucy.saldo = 1000;
		System.out.println("Conta da Lucy: $" + contaLucy.saldo);
		
		contaLucy
	
	}

}
