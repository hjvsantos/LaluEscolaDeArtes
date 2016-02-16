package data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import classesBasicas.Administrador;
import classesBasicas.Turma;
import classesBasicas.Envio;


public class RepositorioTurma {

	public void insert(Turma turma) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("professor", turma.getProfessor());
		json.put("limiteMax", turma.getLimiteMax());
		json.put("limiteMin", turma.getLimiteMin());
		json.put("atividade", turma.getAtividade());
		json.put("codigo", turma.getCodigo());
		Envio envio = new Envio("turma/adicionar",json);
		envio.run();
	}
	
	public void delete(String codigo) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("codigo", codigo);
		Envio envio = new Envio("turma/delete/"+codigo,json);
		envio.run();
		System.out.println(envio.getResults());
	}
	
	public void update(Turma turma) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("professor", turma.getProfessor());
		json.put("limiteMax", turma.getLimiteMax());
		json.put("limiteMin", turma.getLimiteMin());
		json.put("atividade", turma.getAtividade());
		json.put("codigo", turma.getCodigo());
		Envio envio = new Envio("turma/update",json);
		envio.run();
	}
	

	public List<Turma> select() throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("a", "a");
		Envio envio = new Envio("turma/select",json);
		envio.run();
		json = new JSONObject(envio.getResults());
		JSONArray jsonArr= json.getJSONArray("turma");
		List<Turma> list = new ArrayList<>();
		for(int i=0;i<jsonArr.length();i++){
			json = jsonArr.getJSONObject(i);
			Turma turma = new Turma(json.getFuncionario("professor"), json.getInt("limiteMax"), json.getInt("limiteMin"), json.getAtividade("atividade"), json.getString("codigo"));
			list.add(turma);
		}		
		return list;
	}
}
