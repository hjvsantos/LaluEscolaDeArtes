package classesBasicas;

import java.util.Date;

public class Funcionario {
	
	public String nome;
	private String CPF;
	private double rg;
	public Date dataNascimento;
	public double telefone;
	public String endereço;
	public String funcao;
	public String matricula;
	public double salario;
	
	public Funcionario(String nome, String cPF, double rg, Date dataNascimento,
			double telefone, String endereço, String funcao, String matricula,
			double salario) {
	
		this.nome = nome;
		CPF = cPF;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.endereço = endereço;
		this.funcao = funcao;
		this.matricula = matricula;
		this.salario = salario;
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

	public double getRg() {
		return rg;
	}

	public void setRg(double rg) {
		this.rg = rg;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getTelefone() {
		return telefone;
	}

	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
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
		
	
	
}
