package classesBasicas;

public class Administrador {
	
	public String nome;
	public String CPF;
	public String senha;
	


	public Administrador(String nome, String cPF, String senha) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	public String getCPF() {
		return CPF;
	}
	
}
