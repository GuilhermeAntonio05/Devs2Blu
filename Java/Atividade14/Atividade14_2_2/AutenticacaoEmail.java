package Atividade14_2_2;

public class AutenticacaoEmail implements Autenticacao {
	private String senha;

	@Override
	public void verificar() {
		System.out.println("Usuario Liberado!");
		System.out.println("Senha: " + getSenha());
	}

	@Override
	public void salvarSenha(String senha) {
		System.out.println("Salvando senha.");
		this.senha = senha;
	}
	
	public String getSenha() {
		return senha;
	}

}
