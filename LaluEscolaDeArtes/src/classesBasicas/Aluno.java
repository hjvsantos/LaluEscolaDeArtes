package classesBasicas;

import java.util.Date;

public class Aluno {
	public String nome;
	public String endereco;
	public String nomeResponsavel;
	private String CPF;
	private String CPFresponsavel;
	private String RG;
	public String email;
	public Date dataNascimento;
	public double telefone;
	public Date dataPagamento;
	public boolean mensalidade;
	public double valormensalidade;
	public float nota;
		
	public Aluno(String nome, String endereco, String nomeResponsavel,
			String cPF, String cPFresponsavel, String rG, String email,
			Date dataNascimento, double telefone, Date dataPagamento,
			boolean mensalidade, float nota, double valormensalidade) {
		
		this.nome = nome;
		this.endereco = endereco;
		this.nomeResponsavel = nomeResponsavel;
		CPF = cPF;
		CPFresponsavel = cPFresponsavel;
		RG = rG;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.dataPagamento = dataPagamento;
		this.mensalidade = mensalidade;
		this.nota = nota;
		this.valormensalidade = valormensalidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
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

	public double getTelefone() {
		return telefone;
	}

	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public boolean isMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(boolean mensalidade) {
		this.mensalidade = mensalidade;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public double getValormensalidade() {
		return valormensalidade;
	}

	public void setValormensalidade(double valormensalidade) {
		this.valormensalidade = valormensalidade;
	}
	
}