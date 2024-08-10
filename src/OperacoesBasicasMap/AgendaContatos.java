package OperacoesBasicasMap;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	private Map<String, Integer> agendaContatoMap;
	
	

	public AgendaContatos() {
		this.agendaContatoMap = new HashMap<>();
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}
	
	public void removerContato(String nome) {
		if(!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
	}
	
	public void exibirContatos() {
		System.out.println(agendaContatoMap);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if(!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}
		return numeroPorNome;
	}



	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.exibirContatos();
		
		agendaContatos.adicionarContato("Thiago", 123456);
		agendaContatos.adicionarContato("Thiago", 8999);
		agendaContatos.adicionarContato("Thiago Gerbi", 111111);
		agendaContatos.adicionarContato("Thiago Beiço", 4453535);
		agendaContatos.adicionarContato("Gustavo Gerbi", 111111);
		agendaContatos.adicionarContato("Thiago", 444444);
		
		agendaContatos.exibirContatos();
		
		
		agendaContatos.removerContato("Thiago Beiço");
		System.out.println(agendaContatos.pesquisarPorNome("Gustavo Gerbi"));
		
		agendaContatos.exibirContatos();

	}

}
