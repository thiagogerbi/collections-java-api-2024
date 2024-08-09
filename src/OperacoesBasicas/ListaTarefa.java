package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	
	private List<Tarefa> tarefaList;
	
	public ListaTarefa() {
		this.tarefaList = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefaParaRemover = new ArrayList<>();
		
		if (!tarefaList.isEmpty()) {
			for (Tarefa t : tarefaList) {
				if (t.getDescricao().equalsIgnoreCase(descricao)) {
					tarefaParaRemover.add(t);
				}
			}
			tarefaList.removeAll(tarefaParaRemover);
		} else {
			System.out.println("A lista está vazia!");
		}
	}
	
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	
	public void obterDescricoesTarefas() {
		if (!tarefaList.isEmpty()) {
			System.out.println(tarefaList);
		} else {
			System.out.println("A lista está vazia!");
		}
	}
	
	public static void main(String [] args) {
		
		//Criando uma instância da classe ListaTarefa
		ListaTarefa listaTarefa = new ListaTarefa();
		
		// Adicionando tarefas a lista
		
		listaTarefa.adicionarTarefa("Comprar Leite");
		listaTarefa.adicionarTarefa("Estudar programação");
		listaTarefa.adicionarTarefa("Trabalhar");
		listaTarefa.adicionarTarefa("Fazer exercícios");
		
		//Exibindo o número total de tarefas na lista
		System.out.println("Você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista.");
		
		// Exibindo as descrições das tarefas na lista
	    listaTarefa.obterDescricoesTarefas();
	
		// Removendo uma tarefa da lista
	    listaTarefa.removerTarefa("Trabalhar");

	    // Exibindo o número total de tarefas na lista após a remoção
	    System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

	    // Exibindo as descrições das tarefas atualizadas na lista
	    listaTarefa.obterDescricoesTarefas();

	}

}
