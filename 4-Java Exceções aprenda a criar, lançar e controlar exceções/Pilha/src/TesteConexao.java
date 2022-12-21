public class TesteConexao {
	

	public static void main(String[] args) {
		
		try(Conexao conexao = new Conexao() ) {
			conexao.leDados();
		}
		catch(IllegalStateException ex) {
			System.out.println("Erro de conexão.");
		}
		
     //----- forma antiga e mais codigos
//	Conexao con = null;		
//	try {
//			con= new Conexao();
//			con.leDados();
//			//con.fecha(); sempre tem que fechar uma conexão
//		}
//	catch (IllegalStateException ex) {
//			System.out.println("Erro de conexão.");
//			//con.fecha(); // repetindo o codigo
//		}
//	finally {//com ou sem erro vai ser executado 
//		System.out.println("Finally");	
//			if( con != null) {
//					con.close();
//			}
//	}	
//	}	
	}
}
