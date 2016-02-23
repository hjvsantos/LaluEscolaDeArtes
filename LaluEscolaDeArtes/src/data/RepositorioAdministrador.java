package data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import classesBasicas.Administrador;
import classesBasicas.Envio;

public class RepositorioAdministrador implements IRepositorioAdministrador{
	
	public void insert(Administrador administrador) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("nome", administrador.getNome());
		json.put("cpf", administrador.getCPF());
		json.put("senha", administrador.getSenha());
		Envio envio = new Envio("administrador/adicionar",json);
		envio.run();
	}

	public void update(Administrador administrador) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("nome", administrador.getNome());
		json.put("cpf", administrador.getCPF());
		Envio envio = new Envio("administrador/update",json);
		envio.run();
	}

	public List<Administrador> select() throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("a", "a");
		Envio envio = new Envio("administrador/select",json);
		envio.run();
		json = new JSONObject(envio.getResults());
		JSONArray jsonArr= json.getJSONArray("adm");
		List<Administrador> list = new ArrayList<>();
		for(int i=0;i<jsonArr.length();i++){
			json = jsonArr.getJSONObject(i);
			Administrador adm = new Administrador(json.getString("nome"), json.getString("cpf"), json.getString("senha"));
			list.add(adm);
		}		
		return list;
	}

	public void delete(String cpf) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("cpf", cpf);
		Envio envio = new Envio("administrador/delete/"+cpf,json);
		envio.run();
		System.out.println(envio.getResults());
	}
	
	public boolean exists(String cpf) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("nome", "");
		Envio envio = new Envio("administrador/exists/"+cpf,json);
		envio.run();
		int i = Integer.parseInt(envio.getResults());
		if(i>0) return true;
		else return false;
	}
	
	public boolean logar(String cpf,String senha) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("nome", "");
		Envio envio = new Envio("administrador/senha/"+cpf+"/"+senha,json);
		envio.run();
		int i = Integer.parseInt(envio.getResults());
		if(i>0) return true;
		else return false;
	}

}