## Classe produto 
```
package exemploUm;

public class Produto {
	
	private String nome; 
	private int id;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
```

## Classe Estoque 
```
package exemploUm;

public class Estoque {
	
	private String fornecedor;
	private int codigo;
	
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	} 
	
	

}
```

## Classe Mercado 
```
package exemploUm;

import java.util.List; 
import java.util.LinkedList;

public class Mercado {
	
	private List<Produto> produtos = new LinkedList<Produto>;
	private List<Estoque> estoques = new LinkedList<Estoque>; 
	
	public void AddProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void AddEstoque(Estoque estoque) {
		estoques.add(estoque);
	}
	
	public list<Produto> GetProduto() {
		return produtos;
	}
	
	public list<Estoque> GetEstoque() {
		return estoques;
	}
	
	public list<Produto> BuscarProdutoNome(String nome);
	public list<Estoque> BuscarEstoqueCodigo(int codigo);	

}
```
