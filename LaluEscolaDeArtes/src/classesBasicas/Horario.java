package classesBasicas;

import classesBasicas.Turma;

import java.util.Date;

public class Horario {


	private Turma turma;
	private String dia;
	private String horaentrada;
	private String horasaida;
	
	public Horario(Turma turma, String dia, String horaentrada, String horasaida) {
		this.turma = turma;
		this.dia = dia;
		this.horaentrada = horaentrada;
		this.horasaida = horasaida;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHoraentrada() {
		return horaentrada;
	}

	public void setHoraentrada(String horaentrada) {
		this.horaentrada = horaentrada;
	}

	public String getHorasaida() {
		return horasaida;
	}

	public void setHorasaida(String horasaida) {
		this.horasaida = horasaida;
	}
}
