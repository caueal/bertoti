
# Trabalhos - Bertoti Engenharia de Software

# Primero tópico
Os Primeiros trechos do livro Software Engineering at Google, Oreilly, destacam a nomeclatura "Software engineering", de tal forma que fazem uma comparação direta com o termo "Programadores", onde o nome de Engenheiro de software teria mais peso à função, o autor faz uma comparação com a engenharia aeronáutica por exemplo, onde um erro pode ter consequências catastróficas, assim como um erro de código hoje em dia, onde temos diversas aplicações no dia dia.

# Segundo tópico 
O segundo trecho do livro, faz um resumo do que se precisa para aprimorar o ciclo de trabalho de um "Programador", e como tornar mais sustentável e rigoroso com normas e disciplinas, ele cita 3 exemplos de variáveis, tais como: tempo e mudanças, escala e crescimento, decisões e custos

# Exemplos de TradeOff

- 1 Exemplo, caso python e java: simplicidade x integrações -> Enquanto uma linguagem(Python) tem a proposta de uma sintaxe mais simples para o usuário, em contra partida ela perde velocidade, se comparada a outras linguagens mais verbosas, como por exemplo o java.
  
- 2 Exemplo, caso servidores: custo x segurança -> Quando falamos de Servidores, tanto de pequena a larga escala, existe um dilema entre o recurso investido interferir diretamente na integridade de um, como por exemplo, um servidor que possui Proxy, rede bem mapeada e permissões bem estabelecidas, estão sucetíveis a menos ataques, porém isso tudo tem um custo elevado, em contra partida um servidor mais 'Caseiro' de baixo custo, tende a ser mais sucetível a ataques.
  
- 3 Exemplo, espaço - tempo, um algoritimo faz maior uso de cpu e memória em contra partida levando menos tempo



## EXEMPLO DE DIAGRAMA UML ##


![ModeloExercicioBertoti](https://github.com/user-attachments/assets/5fe0a89f-334b-4fa8-8e36-bf27853790d7)

##PROJETO JAVA MERCADO##

## Classe Mercado
```
package projetoMercado;

import java.util.List;
import java.util.LinkedList;

public class Mercado {
	
	private List<Produto> produtos = new LinkedList<Produto>();
	
	public void addProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public List<Produto> getProdutos(){
		return produtos;
	}
	
	public List<Produto> buscarProdutoNome(String nome){
		List<Produto> encontrados = new LinkedList<Produto>();
		for (Produto produto:produtos) {
			if(produto.getNome().equals(nome)) encontrados.add(produto);
		}
		return encontrados;
		
	}
	
	//Lista do Estoque, baseado no fornecedor
	private List<Estoque> estoques = new LinkedList<Estoque>();
	
	public void addEstoque(Estoque estoque) {
		estoques.add(estoque);
	}
	
	public List<Estoque> getEstoques(){
		return estoques;
	}
	
	public List<Estoque> buscarEstoqueFornecedor(String fornecedor){
		List<Estoque> encontradosF = new LinkedList<Estoque>();
		for (Estoque estoque:estoques) {
			if(estoque.getFornecedor().equals(fornecedor)) encontradosF.add(estoque);
		}
		return encontradosF;
		
	}
```

##Classe Produto 
```
package projetoMercado;

public class Produto {
	private String nome; 
	private String tipo; 
		
	public Produto(String nome, String tipo) {
		this.nome = nome; 
		this.tipo = tipo; 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
```

##Classe Estoque 
```
package projetoMercado;

public class Estoque {
	private int quantidade;
	private String fornecedor; 
	
	public Estoque(int quantidade, String fornecedor) {
		this.quantidade = quantidade; 
		this.fornecedor = fornecedor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	

}
```

##Classe Teste (produto)
```
package projetoMercado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;

class Teste {

	@Test
	void test() {
		
		Mercado projetoMercado = new Mercado();
		projetoMercado.addProduto(new Produto("Arroz", "Alimento"));
		
		assertEquals(projetoMercado.getProdutos().size(),1);
		
		List<Produto> produtosEncontrados = projetoMercado.buscarProdutoNome("Arroz");
		
		assertEquals(produtosEncontrados.get(0).getTipo(), "Alimento");

	}

}
```

##Classe TesteEstoque 
```
package projetoMercado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;

class TesteEstoque {

	@Test
	void test() {
		
		Mercado projetoMercado = new Mercado();
		projetoMercado.addEstoque(new Estoque(12, "Jose"));
		
		assertEquals(projetoMercado.getEstoques().size(),1);
		
		List<Estoque> estoquesConsultados = projetoMercado.buscarEstoqueFornecedor("Jose");
		
		assertEquals(estoquesConsultados.get(0).getQuantidade(), 12);

	}

}
```

## Demonstração de testes 

![image](https://github.com/user-attachments/assets/48693156-ba3b-4458-a24d-c8f1afea522e)

![image](https://github.com/user-attachments/assets/14d31d35-78d5-4373-b70b-3567840af8e1)



