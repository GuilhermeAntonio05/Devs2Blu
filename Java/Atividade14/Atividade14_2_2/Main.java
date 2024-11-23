package Atividade14_2_2;

public class Main {

	public static void main(String[] args) {
		AutenticacaoBiometria biometria = new AutenticacaoBiometria();
		AutenticacaoEmail email = new AutenticacaoEmail();

		Autenticar autenticar = new Autenticar(biometria, "123");

		autenticar.salvarSenha();
		autenticar.verificar();

		autenticar = new Autenticar(email, "123");

		autenticar.salvarSenha();
		autenticar.verificar();
		
		autenticar = new Autenticar(email, null);
		
		autenticar.salvarSenha();
		autenticar.verificar();
	}

}
