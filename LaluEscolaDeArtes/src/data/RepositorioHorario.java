package data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import classesBasicas.Administrador;
import classesBasicas.Horario;
import classesBasicas.Envio;

public class RepositorioHorario implements IRepositorioHorario{
	
	public void insert(Horario horario) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("turma", horario.getTurma());
		json.put("dia", horario.getDia());
		json.put("hora", horario.getHora());
		Envio envio = new Envio("horario/adicionar",json);
		envio.run();
	}

	public void update(Horario horario) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("turma", horario.getTurma());
		json.put("dia", horario.getDia());
		json.put("hora", horario.getHora());
		Envio envio = new Envio("horario/update",json);
		envio.run();
	}
	
	public void delete(int hora) throws JSONException, IOException { //nao sei se pode excluir pela hora, qualquer coisa mudar!!
		JSONObject json =  new JSONObject();
		json.put("hora", hora);
		Envio envio = new Envio("horario/delete/"+hora,json);
		envio.run();
		System.out.println(envio.getResults());
	}	

}
