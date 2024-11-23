package br.com.atividade18_1.memento.app;

import br.com.atividade18_1.memento.component.TextEditor;
import br.com.atividade18_1.memento.memory.CareTaker;

public class MementoMain {
	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
		CareTaker caretaker = new CareTaker();

		editor.setText("Vers�o 1");
		caretaker.addMemento(editor.saveToMemento());

		editor.setText("Vers�o 2");
		caretaker.addMemento(editor.saveToMemento());

		editor.setText("Vers�o 3");
		caretaker.addMemento(editor.saveToMemento());

		editor.setText("Vers�o 4");
		caretaker.addMemento(editor.saveToMemento());

		editor.setText("Vers�o 5");
		caretaker.addMemento(editor.saveToMemento());

		// Desfazendo duas vezes
		editor.restoreFromMemento(caretaker.getLastMemento());
		System.out.println("Ap�s desfazer uma vez: " + editor.getText()); // Exibe "Vers�o 2"

		editor.setText("Vers�o 6");
		caretaker.addMemento(editor.saveToMemento());

		editor.restoreFromMemento(caretaker.getLastMemento());
		System.out.println("Ap�s desfazer uma vez: " + editor.getText()); // Exibe "Vers�o 1"
		
		// editor.setText("Vers�o 7");
		// caretaker.addMemento(editor.saveToMemento());

	}
}
