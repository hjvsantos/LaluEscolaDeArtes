package classesBasicas;

public class Turma {
	
	public Funcionario professor;
	public int limiteMax;
	public int limiteMin;
	public Atividade atividade;
	public String codigo;
	
	public Turma(Funcionario professor, int limiteMax, int limiteMin,
			Atividade atividade, String codigo) {
		
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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
}
