package classesBasicas;

import classesBasicas.Turma;
import classesBasicas.Aluno;
import classesBasicas.Atividade;


public class Matricula {
	
	public Aluno aluno;
	public Turma turma;
	
	public Matricula(Aluno aluno, Turma turma) {
		this.aluno = aluno;
		this.turma = turma;
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
}
