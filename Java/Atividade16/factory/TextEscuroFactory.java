package br.com.atividade16_1.absfactory.factory;
import br.com.atividade16_1.absfactory.models.textbox.*;

public class TextEscuroFactory {
	
	public Textbox criarTextbox(){
		return new TextboxClaro();
	}
}
