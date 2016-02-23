package data;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import org.json.JSONException;

import classesBasicas.Funcionario;

public interface IRepositorioFuncionario {
	public void insert(Funcionario funcionario) throws JSONException, IOException;
	public void update(Funcionario funcionario) throws JSONException, IOException;
	public List<Funcionario> select() throws JSONException, IOException, ParseException;
	public void delete(String matricula) throws JSONException, IOException;
	public void criarsenha(String cpf, String senha) throws JSONException, IOException;
	public boolean exists(String cpf) throws JSONException, IOException;
	public boolean logar(String cpf,String senha) throws JSONException, IOException;
}