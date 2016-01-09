package classesBasicas;

import classesBasicas.Funcionario;

public class Atividade {
	public Funcionario funcionario;
	public double horarioInicio;
	public double horarioFim;
	public int quantAlunos;
	public String diaDaSemana;
	
	public Atividade(Funcionario funcionario, double horarioInicio,
			double horarioFim, int quantAlunos, String diaDaSemana) {
		super();
		this.funcionario = funcionario;
		this.horarioInicio = horarioInicio;
		this.horarioFim = horarioFim;
		this.quantAlunos = quantAlunos;
		this.diaDaSemana = diaDaSemana;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public double getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(double horarioInicio) {
		this.horarioInicio = horarioInicio;
	}

	public double getHorarioFim() {
		return horarioFim;
	}

	public void setHorarioFim(double horarioFim) {
		this.horarioFim = horarioFim;
	}

	public int getQuantAlunos() {
		return quantAlunos;
	}

	public void setQuantAlunos(int quantAlunos) {
		this.quantAlunos = quantAlunos;
	}

	public String getDiaDaSemana() {
		return diaDaSemana;
	}

	public void setDiaDaSemana(String diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}
	
	
	
}
