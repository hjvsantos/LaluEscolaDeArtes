package data;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import org.json.JSONException;

import classesBasicas.Administrador;
import classesBasicas.Aluno;
import classesBasicas.Atividade;
import classesBasicas.Funcionario;
import classesBasicas.Horario;
import classesBasicas.Matricula;
import classesBasicas.Turma;

public interface IFachada {
	public void cadastrarAdministrador(Administrador administrador) throws JSONException, IOException;
	public void atualizarAdministrador(Administrador administrador) throws JSONException, IOException;
	public void removerAdministrador(String id) throws JSONException, IOException;
	public List<Administrador> retornarAdministradores() throws JSONException, IOException;
	public void cadastrarAluno(Aluno aluno) throws JSONException, IOException;
	public void atualizarAluno(Aluno aluno) throws JSONException, IOException;
	public void removerAluno(String matricula) throws JSONException, IOException;
	public List<Aluno> retornarAlunos() throws JSONException, IOException, ParseException;
	public void cadastrarAtividade(Atividade atividade)throws JSONException, IOException;
	public void atualizarAtividade(Atividade atividade) throws JSONException, IOException;
	public void removerAtividade(int codigo) throws JSONException, IOException;
	public List<Atividade> retornarAtividades() throws JSONException, IOException;
	public void cadastrarFuncionario(Funcionario funcionario) throws JSONException, IOException;
	public void removerfuncionario(String matricula) throws JSONException, IOException;
	public void atualizarFuncionario(Funcionario funcionario) throws JSONException, IOException;
	public List<Funcionario> retornarFuncionarios() throws JSONException, IOException, ParseException;
	public void cadastrarHorario(Horario horario) throws JSONException, IOException;
	public void removerHorario(int id) throws JSONException, IOException;
	public void atualizarHorario(Horario horario) throws JSONException, IOException;
	public void cadastrarMatricula(Matricula matricula) throws JSONException, IOException;
	public void removerMatricula(int turma, String aluno) throws JSONException, IOException;
	public void cadastrarTurma(Turma turma) throws JSONException, IOException;
	public void atualizarTurma(Turma turma) throws JSONException, IOException;
	public void removerTurma(int codigo) throws JSONException, IOException;
	public List<Turma> retornarTurmas() throws JSONException, IOException;
}
