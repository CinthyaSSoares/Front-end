
public class Fluxo {
	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
		    metodo1();
		} catch(ArithmeticException | NullPointerException ex) {
		    String msg = ex.getMessage();
		    System.out.println("Exception " + msg);
		    ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}
	
	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	
	private static void metodo2() {
		System.out.println("ini do metodo2");
		
		ContaParaErro c = new ContaParaErro();
		
		//Variavel para fazer o throw  do erro
		ArithmeticException ex = new ArithmeticException("Deu erro mano"); {
		throw ex; //jogando a exceção
		}
		//System.out.println("Fim do metodo2");
	}
}
