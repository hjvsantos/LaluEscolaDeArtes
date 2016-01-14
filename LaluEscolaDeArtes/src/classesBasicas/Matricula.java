package classesBasicas;

import classesBasicas.Aluno;
import classesBasicas.Atividade;


public class Matricula {
	
	public Aluno aluno;
	public Turma turma;
	public String codigo;
	
	public Matricula(Aluno aluno, Turma turma, String codigo) {
		this.aluno = aluno;
		this.turma = turma;
		this.codigo = codigo;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
}
