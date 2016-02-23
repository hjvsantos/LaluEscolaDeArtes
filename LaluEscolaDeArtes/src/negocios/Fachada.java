package negocios;

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


public class Fachada implements IFachada{
	private CadastroAdministrador ca = new CadastroAdministrador();
	private CadastroAluno caa = new CadastroAluno();
	private CadastroAtividade cat = new CadastroAtividade();
	private CadastroFuncionario cf = new CadastroFuncionario();
	private CadastroHorario ch = new CadastroHorario();
	private CadastroMatricula cm = new CadastroMatricula();
	private CadastroTurma ct = new CadastroTurma();
	
	
	public void cadastrarAdministrador(Administrador administrador) throws JSONException, IOException{
		ca.insert(administrador);
	}
	
	public void atualizarAdministrador(Administrador administrador) throws JSONException, IOException{
		ca.update(administrador);
	}
	
	public void removerAdministrador(String id) throws JSONException, IOException{
		ca.delete(id);
	}
	
	public List<Administrador> retornarAdministradores() throws JSONException, IOException{
		return ca.select();
	}
	
	public void cadastrarAluno(Aluno aluno) throws JSONException, IOException{
		caa.insert(aluno);
	}
	
	public void atualizarAluno(Aluno aluno) throws JSONException, IOException{
		caa.update(aluno);
	}
	
	public void removerAluno(String matricula) throws JSONException, IOException{
		caa.delete(matricula);
	}
	
	public List<Aluno> retornarAlunos() throws JSONException, IOException, ParseException{
		return caa.select();
	}
	
	public void cadastrarAtividade(Atividade atividade)throws JSONException, IOException{
		cat.insert(atividade);
	}
	
	public void atualizarAtividade(Atividade atividade) throws JSONException, IOException{
		cat.update(atividade);
	}
	public void removerAtividade(int codigo) throws JSONException, IOException{
		cat.delete(codigo);
	}
	
	public List<Atividade> retornarAtividades() throws JSONException, IOException{
		return cat.select();
	}
	
	public void cadastrarFuncionario(Funcionario funcionario) throws JSONException, IOException{
		cf.insert(funcionario);
	}
	
	public void removerfuncionario(String matricula) throws JSONException, IOException{
		cf.delete(matricula);
	}
	
	public void atualizarFuncionario(Funcionario funcionario) throws JSONException, IOException{
		cf.update(funcionario);
	}
	
	public List<Funcionario> retornarFuncionarios() throws JSONException, IOException, ParseException{
		return cf.select();
	}
	
	public void cadastrarHorario(Horario horario) throws JSONException, IOException{
		ch.insert(horario);
	}
	
	public void removerHorario(int id) throws JSONException, IOException{
		ch.delete(id);
	}
	
	public void atualizarHorario(Horario horario) throws JSONException, IOException{
		ch.update(horario);
	}
	
	public void cadastrarMatricula(Matricula matricula) throws JSONException, IOException{
		cm.insert(matricula);
	}
	
	public void removerMatricula(int turma, String aluno) throws JSONException, IOException{
		cm.delete(turma, aluno);
	}
	
	public void cadastrarTurma(Turma turma) throws JSONException, IOException{
		ct.insert(turma);
	}
	
	public void atualizarTurma(Turma turma) throws JSONException, IOException{
		ct.update(turma);
	}
	
	public void removerTurma(int codigo) throws JSONException, IOException{
		ct.delete(codigo);
	}
	
	public List<Turma> retornarTurmas() throws JSONException, IOException{
		return ct.select();
	}
	
	public boolean existeAdministrador(String cpf) throws JSONException, IOException{
		return ca.exists(cpf);
	}
	
	public boolean logarAdministrador(String cpf,String senha) throws JSONException, IOException{
		return ca.logar(cpf, senha);
	}

	public void criarsenhaFuncionario(String cpf, String senha) throws JSONException, IOException {
		cf.criarsenha(cpf, senha);
		
	}

	public boolean existsFuncionario(String cpf) throws JSONException, IOException {
		return cf.exists(cpf);
	}

	public boolean logarFuncionario(String cpf, String senha) throws JSONException, IOException {
		return cf.logar(cpf, senha);
	}
}
