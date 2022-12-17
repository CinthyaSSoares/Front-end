
public class TestaContaExceptionChecked {
	
	public static void main(String[] args) {
		ContaParaErro c = new ContaParaErro();
		try {
			c.deposita(); 
		}
		catch (MinhaException ex){
			System.out.println("Tratamento ...");
		}
		}
}
