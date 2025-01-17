package desafios_condicoes;

import java.util.Scanner;

public class VerificadorNumeroConta {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			String numeroConta = scanner.nextLine();

			// TODO: Chamar o método que verifica se o número da conta é valido
			verificarNumeroConta(numeroConta);

			// Caso nenhuma exceção seja lançada, imprime a mensagem de sucesso.
			System.out.println("Numero de conta valido.");
		} catch (IllegalArgumentException e) {
			// TODO: Informar que o número de conta é inválido e exibir a mensagem de erro
			System.out.println("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
		} finally {
			// Fechar o scanner para evitar vazamentos de recursos
			scanner.close();
		}
	}

	private static void verificarNumeroConta(String numeroConta) {
		if (numeroConta.length() != 8) {
			throw new IllegalArgumentException();
		}
	}
}
