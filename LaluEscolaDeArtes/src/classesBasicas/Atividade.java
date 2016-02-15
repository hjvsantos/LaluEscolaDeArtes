package classesBasicas;

public class Atividade {
	
	public String nome;
	public int quantidadeAlunos;
	public String categoria;
	public double preco;
	public double duracao;
	
	public Atividade(String nome, int quantidadeAlunos, String categoria,
			double preco, double duracao) {
		
		this.nome = nome;
		this.quantidadeAlunos = quantidadeAlunos;
		this.categoria = categoria;
		this.preco = preco;
		this.duracao = duracao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidadeAlunos() {
		return quantidadeAlunos;
	}

	public void setQuantidadeAlunos(int quantidadeAlunos) {
		this.quantidadeAlunos = quantidadeAlunos;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}
	
	
	
		
	
}
