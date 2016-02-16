package data;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import classesBasicas.Atividade;
import classesBasicas.Envio;

public class RepositorioAtividade implements IRepositorioAtividade {
	public void insert(Atividade atividade) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("nome", atividade.getNome());
		json.put("quantidadeAlunos", atividade.getQuantidadeAlunos());
		json.put("categoria", atividade.getCategoria());
		json.put("preco", atividade.getPreco());
		json.put("duracao", atividade.getDuracao());
		Envio envio = new Envio("atividade/adicionar",json);
		envio.run();
	}
	
	public void update(Atividade atividade) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("nome", atividade.getNome());
		json.put("quantidadeAlunos", atividade.getQuantidadeAlunos());
		json.put("categoria", atividade.getCategoria());
		json.put("preco", atividade.getPreco());
		json.put("duracao", atividade.getDuracao());
		Envio envio = new Envio("atividade/update",json);
		envio.run();
	}
	
	public void delete(String nome) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("nome", nome);
		Envio envio = new Envio("atividade/delete/"+nome,json);
		envio.run();
		System.out.println(envio.getResults());
	}	
	
	public List<Atividade> select() throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("a", "a");
		Envio envio = new Envio("atividade/select",json);
		envio.run();
		json = new JSONObject(envio.getResults());
		JSONArray jsonArr= json.getJSONArray("atividade");
		List<Atividade> list = new ArrayList<>();
		for(int i=0;i<jsonArr.length();i++){
			json = jsonArr.getJSONObject(i);
			Atividade atividade = new Atividade(json.getString("nome"), json.getInt("quantidadeAlunos"), json.getString("categoria"), json.getDouble("preco"), json.getDouble("duracao"));
			list.add(atividade);
		}		
		return list;
	}
}
