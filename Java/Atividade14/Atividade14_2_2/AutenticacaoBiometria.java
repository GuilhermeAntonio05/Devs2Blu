package Atividade14_2_2;

public class AutenticacaoBiometria implements Autenticacao {
	private String senha;

	@Override
	public void salvarSenha(String senha) {
		System.out.println("Salvando senha.");
		this.senha = senha;
	}

	@Override
	public void verificar() {
		System.out.println("Usuario Liberado!");
		System.out.println("Senha: " + getSenha());
	}

	public String getSenha() {
		return senha;
	}

}