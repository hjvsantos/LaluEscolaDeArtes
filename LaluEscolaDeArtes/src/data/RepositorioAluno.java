package data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import classesBasicas.Aluno;
import classesBasicas.Envio;

public class RepositorioAluno implements IRepositorioAluno {
	
	public void insert(Aluno aluno) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("nome", aluno.getNome());
		json.put("endereco", aluno.getEndereco());
		json.put("nomeResponsavel", aluno.getNomeResponsavel());
		json.put("CPF", aluno.getCPF());
		json.put("RG", aluno.getRG());
		json.put("email", aluno.getEmail());
		json.put("telefone", aluno.getTelefone());
		json.put("dataPagamento", aluno.getDataPagamento());

		json.put("valormensalidade", aluno.getValormensalidade());
		Envio envio = new Envio("aluno/adicionar",json);
		envio.run();
	}
	
	public void update(Aluno aluno) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("nome", aluno.getNome());
		json.put("endereco", aluno.getEndereco());
		json.put("nomeResponsavel", aluno.getNomeResponsavel());
		json.put("CPF", aluno.getCPF());
		json.put("RG", aluno.getRG());
		json.put("email", aluno.getEmail());
		json.put("telefone", aluno.getTelefone());
		json.put("dataPagamento", aluno.getDataPagamento());
		json.put("valormensalidade", aluno.getValormensalidade());
		Envio envio = new Envio("aluno/update",json);
		envio.run();
	}
	
	public void delete(String CPF) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("cpf", CPF);
		Envio envio = new Envio("aluno/delete/"+CPF,json);
		envio.run();
		System.out.println(envio.getResults());
	}	
	
	public List<Aluno> select() throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("a", "a");
		Envio envio = new Envio("aluno/select",json);
		envio.run();
		json = new JSONObject(envio.getResults());
		JSONArray jsonArr= json.getJSONArray("aluno");
		List<Aluno> list = new ArrayList<>();
		for(int i=0;i<jsonArr.length();i++){
			json = jsonArr.getJSONObject(i);
			Aluno aluno = new Aluno(json.getString("nome"), json.getString("RG"), json.getString("CPF"), json.getString("endereco"), json.getString("email"), json.getDouble("telefone"), json.getDouble("dataPagamento"), json.getDouble("valormensalidade"));
			list.add(aluno);
		}		
		return list;
	}
}
