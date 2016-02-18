package classesBasicas;

import java.util.Date;

public class Aluno {
	private String nome;
	private Endereco endereco;
	private String nomeResponsavel;
	private String CPF;
	private String CPFresponsavel;
	private String RG;
	private String email;
	private Date dataNascimento;
	private String telefone;
	private Date dataPagamento;
	private String matricula;
	private String celular;
	private String celular1;
	
	public Aluno(String nome, Endereco endereco, String nomeResponsavel,
			String cPF, String cPFresponsavel, String rG, String email,
			Date dataNascimento, String telefone, Date dataPagamento,
			String matricula,String celular,String celular1) {
		this.nome = nome;
		this.endereco = endereco;
		this.nomeResponsavel = nomeResponsavel;
		this.CPF = cPF;
		this.CPFresponsavel = cPFresponsavel;
		this.RG = rG;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.dataPagamento = dataPagamento;
		this.matricula = matricula;
		this.celular = celular;
		this.celular1 = celular1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getCPFresponsavel() {
		return CPFresponsavel;
	}

	public void setCPFresponsavel(String cPFresponsavel) {
		CPFresponsavel = cPFresponsavel;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
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
			
	}