package data;

import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

import classesBasicas.Matricula;
import classesBasicas.Envio;

public class RepositorioMatricula implements IRepositorioMatricula {
	
	public void insert(Matricula matricula) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("aluno", matricula.getAluno().getMatricula());
		json.put("turma", matricula.getTurma().getCodigo());
		Envio envio = new Envio("matricula/adicionar",json);
		envio.run();
	}
	
	public void delete(int turma,String aluno) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("codigo", turma);
		Envio envio = new Envio("matricula/delete/"+turma+"/"+aluno,json);
		envio.run();
		System.out.println(envio.getResults());
	}	
}