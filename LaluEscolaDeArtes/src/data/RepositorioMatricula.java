package data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import classesBasicas.Administrador;
import classesBasicas.Matricula;
import classesBasicas.Envio;

public class RepositorioMatricula implements IRepositorioMatricula {
	
	public void insert(Matricula matricula) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("aluno", matricula.getAluno());
		json.put("turma", matricula.getTurma());
		json.put("codigo", matricula.getCodigo());
		Envio envio = new Envio("matricula/adicionar",json);
		envio.run();
	}
	
	public void update(Matricula matricula) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("aluno", matricula.getAluno());
		json.put("turma", matricula.getTurma());
		json.put("codigo", matricula.getCodigo());
		Envio envio = new Envio("matricula/update",json);
		envio.run();
	}
	
	public void delete(String codigo) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("codigo", codigo);
		Envio envio = new Envio("matricula/delete/"+codigo,json);
		envio.run();
		System.out.println(envio.getResults());
	}	

}
