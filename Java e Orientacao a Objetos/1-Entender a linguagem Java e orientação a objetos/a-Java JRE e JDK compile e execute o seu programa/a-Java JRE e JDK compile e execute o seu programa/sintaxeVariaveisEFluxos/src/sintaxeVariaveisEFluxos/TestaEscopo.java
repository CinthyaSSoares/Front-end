package sintaxeVariaveisEFluxos;

public class TestaEscopo {
	public static void main(String[] args) {
		// "sysout" + "crtl+espaço" + "enter" para auto-complete do system
		System.out.println("Testanto condicionais");

		int idade = 15;
		int quantidadePessoas = 3;
		boolean acompanhado;
		
		if(quantidadePessoas >= 2) {
			acompanhado = true;
		}
		else {
			acompanhado = false;
		}
		System.out.println("O valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Menor de 18 anos não pode entrar sem acompanhante.");
		}
	}
}
