package classesBasicas;

import java.util.Date;

public class Horario {

		public Turma turma;
		public Date dia;
		public Date hora;
		
		public Horario(Turma turma, Date dia, Date hora) {
			super();
			this.turma = turma;
			this.dia = dia;
			this.hora = hora;
		}

		public Turma getTurma() {
			return turma;
		}

		public void setTurma(Turma turma) {
			this.turma = turma;
		}

		public Date getDia() {
			return dia;
		}

		public void setDia(Date dia) {
			this.dia = dia;
		}

		public Date getHora() {
			return hora;
		}

		public void setHora(Date hora) {
			this.hora = hora;
		}
		
		
		
}
