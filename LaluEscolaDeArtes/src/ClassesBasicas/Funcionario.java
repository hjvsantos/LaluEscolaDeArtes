package ClassesBasicas;

import java.util.Date;

public class Funcionario {
	
	public String nome;
	private String CPF;
	private double rg;
	public Date dataNascimento;
	public double telefone;
	public String enderešo;
	public String funcao;
	private String user;
	private String senha;
	public String email;
	
	
	public Funcionario(String nome, String cPF, double rg, Date dataNascimento,
			double telefone, String enderešo, String funcao, String user,
			String senha, String email) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.enderešo = enderešo;
		this.funcao = funcao;
		this.user = user;
		this.senha = senha;
		this.email = email;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getTelefone() {
		return telefone;
	}


	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setCPF(String cPF) {
		CPF = cPF;
	}


	public void setRg(double rg) {
		this.rg = rg;
	}


	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}


	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	
	
}
