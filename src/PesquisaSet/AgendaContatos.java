package PesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	private Set<Contato> contatoSet;
	
	

	public AgendaContatos() {
		super();
		this.contatoSet = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		contatoSet.add(new Contato(nome,numero));
	}
	
	public void exibirContato() {
		System.out.println(contatoSet);
	}

	public Set<Contato> pesquisarPorNome(String nome){
		Set<Contato> contatosPorNome = new HashSet<>();
		for(Contato c : contatoSet) {
			if(c.getNome().startsWith(nome)) {
				contatosPorNome.add(c);
			}
		}
		return contatosPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int numero) {
		Contato contatoAtualizado = null;
		for (Contato c : contatoSet) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(numero);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
	}

	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.exibirContato();
		
		agendaContatos.adicionarContato("Thiago", 123456);
		agendaContatos.adicionarContato("Thiago", 8999);
		agendaContatos.adicionarContato("Thiago Gerbi", 111111);
		agendaContatos.adicionarContato("Thiago Beiço", 4453535);
		agendaContatos.adicionarContato("Gustavo Gerbi", 111111);
		
		agendaContatos.exibirContato();
		
		System.out.println(agendaContatos.pesquisarPorNome("Gustavo"));
		
		System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Gustavo Gerbi", 6767670));
		
		agendaContatos.exibirContato();

	}

}
