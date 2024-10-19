package questao1;

public class Valor {

    private int valor = 1500;
    private boolean desconto = false;
    private double aluguel;

    public Valor() {
    }
   
    public Valor(boolean desconto, double aluguel) {
        this.desconto = desconto;
        this.aluguel = aluguel;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public boolean getDesconto() {
        return desconto;
    }

    public void setDesconto(boolean desconto) {
        this.desconto = desconto;
    }

    public double getAluguel() {
        return aluguel;
    }

    public void setAluguel(double aluguel) {
        this.aluguel = aluguel;
    }
    
    public void status(){
        System.out.println("Valor: "+this.getValor());
        System.out.println("Valor do Aluguel: "+this.getAluguel());
        System.out.println("Valor final: "+this.valorFinal());
    }
    
    public double valorFinal() {
        if (this.desconto) {
           return this.valor += this.aluguel * 0.9;
        } else {
           return this.aluguel += this.valor;
        }
    }
    
    
}
