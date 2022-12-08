package sintaxeVariaveisEFluxos;

public class TestaCondicional {
	public static void main(String[] args) {
		// "sysout" + "crtl+espaço" + "enter" para auto-complete do system
		System.out.println("Testanto condicionais");

		int idade = 15;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem vindo!");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você não tem 18 anos mas pode entrar pois está acompanhado");
			} else {
				System.out.println("Menor de 18 anos não pode entrar sem acompanhante.");
			}
		}
	}
}
