
public class Fluxo {
	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
		    metodo1();
		} catch(Exception ex) {
		    String msg = ex.getMessage();
		    System.out.println("Exception " + msg);
		    ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}
	
	private static void metodo1()  throws MinhaException {//lançando a exception  Checked
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	
	private static void metodo2() throws MinhaException {//lançando a exception  Checked
		System.out.println("ini do metodo2");
		
		//Chamando a clase para o throw  do erro
		throw new MinhaException("Deu erro mano"); 
		}
		//System.out.println("Fim do metodo2");
	}

