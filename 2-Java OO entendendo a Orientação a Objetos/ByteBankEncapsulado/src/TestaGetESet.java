
public class TestaGetESet {
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		//conta.numero = 1338; nao é publico então não funciona
		conta.setNumero(1660);
		
		System.out.println("Número da conta: " + conta.getNumero());
		
		Cliente lili = new Cliente();
		
		//conta.titular = lili;
		lili.setNome("Lili Bossi");
		
		conta.setTitular(lili);
		
		System.out.println("Nome da titular: " + conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programadora");
		
		System.out.println("Profissão: " + conta.getTitular().getProfissao());
		
		//Reforçando 
		
		System.out.println(lili);
		System.out.println(conta.getTitular());
		
	}
}
