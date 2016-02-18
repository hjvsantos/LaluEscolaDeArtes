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
		json.put("tipo", atividade.getTipo());
		json.put("preco", atividade.getPreco());
		json.put("duracao", atividade.getDuracao());
		Envio envio = new Envio("atividade/adicionar",json);
		envio.run();
	}
	
	public void update(Atividade atividade) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("nome", atividade.getNome());
		json.put("tipo", atividade.getTipo());
		json.put("preco", atividade.getPreco());
		json.put("duracao", atividade.getDuracao());
		json.put("codigo", atividade.getCodigo());
		Envio envio = new Envio("atividade/update",json);
		envio.run();
	}
	
	public void delete(int codigo) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("codigo", codigo);
		Envio envio = new Envio("atividade/delete/"+codigo,json);
		envio.run();
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
			Atividade atividade = new Atividade(json.getString("nome"), json.getString("tipo"), json.getDouble("preco"), json.getDouble("duracao"),json.getInt("id"));
			list.add(atividade);
		}		
		return list;
	}
}
