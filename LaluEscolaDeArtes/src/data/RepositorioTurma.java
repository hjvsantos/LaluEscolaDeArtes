package data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import classesBasicas.Atividade;
import classesBasicas.Turma;
import classesBasicas.Envio;
import classesBasicas.Funcionario;


public class RepositorioTurma implements IRepositorioTurma{

	public void insert(Turma turma) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("professor", turma.getProfessor().getMatricula());
		json.put("limitemax", turma.getLimiteMax());
		json.put("limitemin", turma.getLimiteMin());
		json.put("atividade", turma.getAtividade().getCodigo());
		Envio envio = new Envio("turma/adicionar",json);
		envio.run();
	}
	
	public void delete(int codigo) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("codigo", codigo);
		Envio envio = new Envio("turma/delete/"+codigo,json);
		envio.run();
		System.out.println(envio.getResults());
	}
	
	public void update(Turma turma) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("professor", turma.getProfessor().getMatricula());
		json.put("limitemax", turma.getLimiteMax());
		json.put("limitemin", turma.getLimiteMin());
		json.put("atividade", turma.getAtividade().getCodigo());
		json.put("codigo", turma.getCodigo());
		Envio envio = new Envio("turma/update",json);
		envio.run();
		System.out.println(envio.getResults());
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
			Funcionario f = new Funcionario(null, null, null, null, null, null, null, i, null, null, null, null, null);
			f.setMatricula(json.getString("matricula"));
			f.setNome(json.getString("professornome"));
			Atividade a = new Atividade(null, null, 0, 0, 0);
			a.setCodigo(json.getInt("atividade"));
			a.setNome(json.getString("atividadenome"));
			Turma turma = new Turma(f, json.getInt("limitemax"), json.getInt("limitemin"), a, json.getInt("codigo"));
			list.add(turma);
		}		
		return list;
	}
}
