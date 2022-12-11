
public class TestaBanco {
	public static void main(String[] args) {
		
		Cliente ana = new Cliente();
		ana.nome = "Ana Silva";
		ana.cpf = "111.111.111-11";
		ana.profissao = "Programadora";
		
		Conta contaAna = new Conta();
		contaAna.deposita(100);
		
		// Associa titular ao cliente
		contaAna.titular = ana;
		
		System.out.println("Referencias da conta Ana");
		System.out.println(contaAna.titular.nome);
		System.out.println(contaAna.titular);
		System.out.println(ana);
		
		
	}
}
