package questao1;

public class Tema {

    private String[] temas = {"Castelo", "Boneca da Cinderela", "Bruxa"};
    private String corToalha;
    private int temaEscolhido;

    public Tema(String corToalha, int temaEscolhido) {
        this.corToalha = corToalha;
        this.temaEscolhido = temaEscolhido - 1;
    }

    public String[] getTemas() {
        return temas;
    }

    public void setTemas(String[] temas) {
        this.temas = temas;
    }

    public String getCorToalha() {
        return corToalha;
    }

    public void setCorToalha(String corToalha) {
        this.corToalha = corToalha;
    }

    public int getTemaEscolhido() {
        return temaEscolhido;
    }

    public void setTemaEscolhido(int temaEscolhido) {
        this.temaEscolhido = temaEscolhido;
    }

    public void status() {
        System.out.println("Cor da toalha: " + this.corToalha);
        System.out.println("Tema: " + this.temas[temaEscolhido]);
    }

}
