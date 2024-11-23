package br.com.atividade18_1.memento.memory;

import java.util.ArrayList;
import java.util.List;

import br.com.atividade18_1.memento.component.TextEditor;

public class CareTaker {
	private List<TextEditor.Memento> savedStates = new ArrayList<>();

	// Adiciona um novo memento � lista
	public void addMemento(TextEditor.Memento memento) {
		savedStates.add(memento);
	}

	// Recupera o �ltimo memento salvo e remove-o da lista
	public TextEditor.Memento getLastMemento() {
		if (savedStates.size() > 5) {
			savedStates.remove(0);
		}
		return savedStates.get(0);
	}
}