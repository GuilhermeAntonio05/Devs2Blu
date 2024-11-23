package br.com.atividade17_1.bridge.app;
import br.com.atividade17_1.bridge.cores.Azul;
import br.com.atividade17_1.bridge.cores.Verde;
import br.com.atividade17_1.bridge.cores.Vermelho;
import br.com.atividade17_1.bridge.estilos.Solido;
import br.com.atividade17_1.bridge.estilos.Tracejado;
import br.com.atividade17_1.bridge.formas.Circulo;
import br.com.atividade17_1.bridge.formas.Forma;
import br.com.atividade17_1.bridge.formas.Quadrado;
import br.com.atividade17_1.bridge.formas.Triangulo;

public class App {
    public static void main(String[] args) {
        Forma circuloVermelho = new Circulo(new Vermelho(), new Tracejado());
        circuloVermelho.desenhar();

        Forma quadradoAzul = new Quadrado(new Azul(), new Solido());
        quadradoAzul.desenhar();

        Forma trianguloVerde = new Triangulo(new Verde(), new Tracejado());
        trianguloVerde.desenhar();
        
    }
}
