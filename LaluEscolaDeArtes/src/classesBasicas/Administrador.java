package classesBasicas;

public class Administrador {
	
	public String nome;
	public String CPF;
	public String login;
	public String senha;
	public Funcionario funcionario;
	public String turma; //turma vai ser determinada pelo adm pois informará o funcionario, horario e dia que acontecerá 
	
	


	public Administrador(String nome, String cPF, String login, String senha,
			Funcionario funcionario, String turma) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.login = login;
		this.senha = senha;
		this.funcionario = funcionario;
		this.turma = turma;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
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
	

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}
	
}
