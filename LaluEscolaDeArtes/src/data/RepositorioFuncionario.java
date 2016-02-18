package data;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import classesBasicas.Funcionario;
import classesBasicas.Envio;
import classesBasicas.Endereco;

public class RepositorioFuncionario implements IRepositorioFuncionario {

	public void insert(Funcionario funcionario) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("nome", funcionario.getNome());
		json.put("logradouro", funcionario.getEndereco().getLogradouro());
		json.put("cidade", funcionario.getEndereco().getCidade());
		json.put("estado", funcionario.getEndereco().getEstado());
		json.put("bairro", funcionario.getEndereco().getBairro());
		json.put("cep", funcionario.getEndereco().getCep());
		json.put("numero", funcionario.getEndereco().getNumero());
		json.put("complemento", funcionario.getEndereco().getComplemento());
		json.put("cpf", funcionario.getCPF());
		json.put("rg", funcionario.getRg());
		json.put("datanasc", funcionario.getDataNascimento());
		json.put("telefone", funcionario.getTelefone());
		json.put("celular", funcionario.getCelular());
		json.put("celular1", funcionario.getCelular1());
		json.put("salario", funcionario.getSalario());
		json.put("funcao", funcionario.getFuncao());
		json.put("email", funcionario.getEmail());
		json.put("login", funcionario.getLogin());
		json.put("senha", funcionario.getSenha());
		Envio envio = new Envio("funcionario/adicionar",json);
		envio.run();
	}
	
	public void delete(String matricula) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("cpf", matricula);
		Envio envio = new Envio("funcionario/delete/"+matricula,json);
		envio.run();
		System.out.println(envio.getResults());
	}	
	
	public void update(Funcionario funcionario) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("nome", funcionario.getNome());
		json.put("logradouro", funcionario.getEndereco().getLogradouro());
		json.put("cidade", funcionario.getEndereco().getCidade());
		json.put("estado", funcionario.getEndereco().getEstado());
		json.put("bairro", funcionario.getEndereco().getBairro());
		json.put("cep", funcionario.getEndereco().getCep());
		json.put("numero", funcionario.getEndereco().getNumero());
		json.put("complemento", funcionario.getEndereco().getComplemento());
		json.put("CPF", funcionario.getCPF());
		json.put("RG", funcionario.getRg());
		json.put("telefone", funcionario.getTelefone());
		json.put("celular", funcionario.getCelular());
		json.put("celular1", funcionario.getCelular1());
		json.put("salario", funcionario.getSalario());
		json.put("funcao", funcionario.getFuncao());
		json.put("email", funcionario.getEmail());
		json.put("login", funcionario.getLogin());
		Envio envio = new Envio("funcionario/update",json);
		envio.run();
	}
	
	public List<Funcionario> select() throws JSONException, IOException, ParseException {
		JSONObject json =  new JSONObject();
		json.put("a", "a");
		Envio envio = new Envio("funcionario/select",json);
		envio.run();
		json = new JSONObject(envio.getResults());
		JSONArray jsonArr= json.getJSONArray("funcionario");
		List<Funcionario> list = new ArrayList<>();
		for(int i=0;i<jsonArr.length();i++){
			json = jsonArr.getJSONObject(i);
			Endereco endereco = new Endereco(json.getString("logradouro"),json.getString("cidade"),json.getString("bairro"),json.getString("estado"),json.getString("numero"),json.getString("cep"),json.getString("complemento"));
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			Funcionario funcionario = new Funcionario(json.getString("nome"), json.getString("cpf"), json.getString("rg"), new Date(df.parse(json.getString("datanasc")).getTime()),json.getString("telefone"), json.getString("funcao"), json.getString("matricula"), json.getDouble("salario"), json.getString("celular"), json.getString("celular1"), json.getString("email"), endereco, json.getString("login"), "");
			list.add(funcionario);
		}		
		return list;
	}


}
