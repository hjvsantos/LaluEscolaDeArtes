package classesBasicas;

import classesBasicas.Aluno;
import classesBasicas.Atividade;


public class Matricula {
	
	public Aluno aluno;
	public Funcionario professor;
	public Funcionario dia;
	public Funcionario horario;
	public Administrador turma;
	
	public Matricula(Aluno aluno, Funcionario professor, Funcionario dia,
			Funcionario horario, Administrador turma) {
		super();
		this.aluno = aluno;
		this.professor = professor;
		this.dia = dia;
		this.horario = horario;
		this.turma = turma;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Funcionario getProfessor() {
		return professor;
	}

	public void setProfessor(Funcionario professor) {
		this.professor = professor;
	}

	public Funcionario getDia() {
		return dia;
	}

	public void setDia(Funcionario dia) {
		this.dia = dia;
	}

	public Funcionario getHorario() {
		return horario;
	}

	public void setHorario(Funcionario horario) {
		this.horario = horario;
	}

	public Administrador getTurma() {
		return turma;
	}

	public void setTurma(Administrador turma) {
		this.turma = turma;
	}
	
	
	
	
}
