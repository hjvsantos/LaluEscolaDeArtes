package classesBasicas;

public class Atividade {
	
	private int codigo;
	private String nome;
	private String tipo;
	private double preco;
	private double duracao;
	
	public Atividade(String nome, String tipo,
			double preco, double duracao, int codigo) {
		
		this.nome = nome;
		this.tipo = tipo;
		this.preco = preco;
		this.duracao = duracao;
		this.codigo = codigo;
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

	public void setCategoria(String tipo) {
		this.tipo = tipo;
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

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}
