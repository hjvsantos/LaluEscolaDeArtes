package classesBasicas;

import classesBasicas.Endereco;

import java.util.Date;

public class Funcionario {
	
	public String nome;
	private String CPF;
	private String rg;
	public Date dataNascimento;
	public String telefone;
	public String funcao;
	public String matricula;
	public double salario;
	public String celular;
	public String celular1;
	public String email;
	public Endereco endereco;
	
	
	public Funcionario(String nome, String cPF, String rg, Date dataNascimento,
			String telefone, String funcao, String matricula, double salario,
			String celular, String celular1, String email,
			classesBasicas.Endereco endereco) {
		this.nome = nome;
		CPF = cPF;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.funcao = funcao;
		this.matricula = matricula;
		this.salario = salario;
		this.celular = celular;
		this.celular1 = celular1;
		this.email = email;
		this.endereco = endereco;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCPF() {
		return CPF;
	}


	public void setCPF(String cPF) {
		CPF = cPF;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public Date getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getFuncao() {
		return funcao;
	}


	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getCelular1() {
		return celular1;
	}


	public void setCelular1(String celular1) {
		this.celular1 = celular1;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
		
	
	
}
