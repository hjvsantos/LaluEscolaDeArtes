package data;

import java.io.IOException;
import java.util.List;

import org.json.JSONException;

import classesBasicas.Funcionario;

public interface IRepositorioFuncionario {
	public void insert(Funcionario funcionario) throws JSONException, IOException;
	public void update(Funcionario funcionario) throws JSONException, IOException;
	public List<Funcionario> select() throws JSONException, IOException;
	public void delete(String cpf) throws JSONException, IOException;
}
