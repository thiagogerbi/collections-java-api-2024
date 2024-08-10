package OrdenacaoSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	private Set<Produto> produtoSet;
	
	

	public CadastroProdutos() {
		this.produtoSet = new HashSet<>();
	}

	public void adicionarProduto(String nome, long codigo, double preco, int quantidade) {
		produtoSet.add(new Produto(nome, codigo, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome(){
		Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
		return produtosPorNome;
	}
	
	public Set<Produto> exibirPorPreco(){
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtosPorPreco.addAll(produtoSet);
		return produtosPorPreco;
	}


	public static void main(String[] args) {
		CadastroProdutos cadastroProdutos = new CadastroProdutos();
		
		cadastroProdutos.adicionarProduto("Produto 5", 1L, 15d, 5);
		cadastroProdutos.adicionarProduto("Produto 0", 2L, 20d, 10);
		cadastroProdutos.adicionarProduto("Produto 3", 1L, 10d, 2);
		cadastroProdutos.adicionarProduto("Produto 9", 9L, 2d, 2);
		
		System.out.println(cadastroProdutos.produtoSet);
		
		System.out.println(cadastroProdutos.exibirProdutosPorNome());
		
		System.out.println(cadastroProdutos.exibirPorPreco());

	}

}
