package Atividade14_2_2;

public class Autenticar {
	private Autenticacao autenticacao;
	private String senha;
	
	public Autenticar(Autenticacao autenticacao,String senha) {
		this.autenticacao = autenticacao;
		this.senha = senha;
	}
	
	public void salvarSenha() {
		this.autenticacao.salvarSenha(this.senha);
	}
	
	public void verificar() {
		if (senha != null) {
			this.autenticacao.verificar();
		}else {
			System.out.println("Senha não registrada!");
		}
	}
	
}
