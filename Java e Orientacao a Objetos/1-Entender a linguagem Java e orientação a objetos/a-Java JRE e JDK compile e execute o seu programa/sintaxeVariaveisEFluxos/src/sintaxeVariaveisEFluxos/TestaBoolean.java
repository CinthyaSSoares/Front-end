package sintaxeVariaveisEFluxos;

public class TestaBoolean {

	public static void main(String[] args) {
		// "sysout" + "crtl+espaço" + "enter" para auto-complete do system
		System.out.println("Testanto condicionais");

		int idade = 15;
		boolean acompanhado = true;
		// ou boolean acompanhado = quantidadePessoas >= 2;
		
		
		// || significa "ou"
		// && significa "e"
		// == significa "igual"
		// boolean apenas recebe "true" ou "false"
		
		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {
				System.out.println("Menor de 18 anos não pode entrar sem acompanhante.");
			}
		}
	}

