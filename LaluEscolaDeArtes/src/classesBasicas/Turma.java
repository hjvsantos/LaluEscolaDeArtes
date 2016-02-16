package classesBasicas;

public class Turma {
	
	public Funcionario professor;
	public int limiteMax;
	public int limiteMin;
	public Atividade atividade;
	public int codigo;
	
	public Turma(Funcionario professor, int limiteMax, int limiteMin,
			Atividade atividade, int codigo) {
		
		this.professor = professor;
		this.limiteMax = limiteMax;
		this.limiteMin = limiteMin;
		this.atividade = atividade;
		this.codigo = codigo;
	}

	public Funcionario getProfessor() {
		return professor;
	}

	public void setProfessor(Funcionario professor) {
		this.professor = professor;
	}

	public int getLimiteMax() {
		return limiteMax;
	}

	public void setLimiteMax(int limiteMax) {
		this.limiteMax = limiteMax;
	}

	public int getLimiteMin() {
		return limiteMin;
	}

	public void setLimiteMin(int limiteMin) {
		this.limiteMin = limiteMin;
	}

	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	
}
