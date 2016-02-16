package data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import classesBasicas.Administrador;
import classesBasicas.Aluno;
import classesBasicas.Funcionario;
import classesBasicas.Envio;

public class RepositorioFuncionario implements IRepositorioFuncionario {

	public void insert(Funcionario funcionario) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("nome", funcionario.getNome());
		json.put("endereco", funcionario.getEndereço());
		json.put("CPF", funcionario.getCPF());
		json.put("RG", funcionario.getRg());
		json.put("telefone", funcionario.getTelefone());
		json.put("salario", funcionario.getSalario());
		json.put("funcao", funcionario.getFuncao());
		json.put("email", funcionario.getEmail());
		Envio envio = new Envio("funcionario/adicionar",json);
		envio.run();
	}
	
	public void delete(String CPF) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("cpf", CPF);
		Envio envio = new Envio("funcionario/delete/"+CPF,json);
		envio.run();
		System.out.println(envio.getResults());
	}	
	
	public void update(Funcionario funcionario) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("nome", funcionario.getNome());
		json.put("endereco", funcionario.getEndereço());
		json.put("CPF", funcionario.getCPF());
		json.put("RG", funcionario.getRg());
		json.put("telefone", funcionario.getTelefone());
		json.put("salario", funcionario.getSalario());
		json.put("funcao", funcionario.getFuncao());
		json.put("email", funcionario.getEmail());
		Envio envio = new Envio("funcionario/update",json);
		envio.run();
	}
	
	public List<Funcionario> select() throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("a", "a");
		Envio envio = new Envio("funcionario/select",json);
		envio.run();
		json = new JSONObject(envio.getResults());
		JSONArray jsonArr= json.getJSONArray("funcionario");
		List<Funcionario> list = new ArrayList<>();
		for(int i=0;i<jsonArr.length();i++){
			json = jsonArr.getJSONObject(i);
			Funcionario funcionario = new Funcionario(json.getString("nome"), json.getString("RG"), json.getString("CPF"), json.getString("endereco"), json.getString("email"), json.getString("funcao"), json.getDouble("telefone"), json.getDouble("salario"));
			list.add(funcionario);
		}		
		return list;
	}


}
