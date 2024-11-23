package br.com.atividade17_2.bridge.app;

import br.com.atividade17_2.bridge.Empregados.Analista;
import br.com.atividade17_2.bridge.Empregados.Empregado;
import br.com.atividade17_2.bridge.Empregados.GerenteDeProjetos;
import br.com.atividade17_2.bridge.Empregados.Secretaria;
import br.com.atividade17_2.bridge.Formatos.Cvs;
import br.com.atividade17_2.bridge.Formatos.Json;

public class App {

	public static void main(String[] args) {
		Empregado secretaria = new Secretaria(new Cvs(), "Julia", 1000, 70);
		Empregado analista = new Analista(new Cvs(), "Marcos", 1200, 55);
		Empregado Gerente = new GerenteDeProjetos(new Cvs(), "Maria", 5000, 25);

		secretaria.relatorio();
		analista.relatorio();
		Gerente.relatorio();
		System.out.println();

		secretaria = new Secretaria(new Json(), "Julia", 1000, 70);
		analista = new Analista(new Json(), "Marcos", 1200, 55);
		Gerente = new GerenteDeProjetos(new Json(), "Maria", 5000, 25);
		
		secretaria.relatorio();
		System.out.println();
		analista.relatorio();
		System.out.println();
		Gerente.relatorio();
	}

}
