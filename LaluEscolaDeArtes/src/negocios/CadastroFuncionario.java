package negocios;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import org.json.JSONException;

import classesBasicas.Funcionario;
import data.IRepositorioFuncionario;
import data.RepositorioFuncionario;

public class CadastroFuncionario {
	private IRepositorioFuncionario ra = new RepositorioFuncionario();
	
	public void insert(Funcionario funcionario) throws JSONException, IOException{
		ra.insert(funcionario);
	}
	
	public void update(Funcionario funcionario) throws JSONException, IOException{
		ra.update(funcionario);
	}
	
	public void delete(String matricula) throws JSONException, IOException{
		ra.delete(matricula);
	}
	
	public List<Funcionario> select() throws JSONException, IOException, ParseException{
		return ra.select();
	}
	
	public void criarsenha(String cpf, String senha) throws JSONException, IOException{
		ra.criarsenha(cpf, senha);
	}
	
	public boolean exists(String cpf) throws JSONException, IOException{
		return ra.exists(cpf);
	}
	
	public boolean logar(String cpf,String senha) throws JSONException, IOException{
		return ra.logar(cpf, senha);
	}
}
