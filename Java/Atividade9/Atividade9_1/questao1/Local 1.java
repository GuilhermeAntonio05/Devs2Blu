package questao1;

public class Local {
	private String endereco;

	public Local( String endereco) {
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
        
	public void status() {
		System.out.println("Endereco: " + this.endereco);
	}
}
