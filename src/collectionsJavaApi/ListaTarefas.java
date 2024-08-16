package collectionsJavaApi;

import java.util.List;

public class ListaTarefas {
	
	private List<Tarefa> tarefas;
	
	void adicionarTarefa(String descricao){
		tarefas.add(new Tarefa(descricao));
	}
	
	void removerTarefa(String descricao) {
		tarefas.removeIf(l -> l.equals(descricao));
	}
	
	int obterNumeroTotalTarefas() {
		return tarefas.size();
	}
	
	void obterDescricoesTarefas() {
		tarefas.forEach(
		tarefa -> System.out.println(tarefa.getDescricao()
		));
	}
}
