package data;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import classesBasicas.Aluno;
import classesBasicas.Endereco;
import classesBasicas.Envio;

public class RepositorioAluno implements IRepositorioAluno {
	
	public void insert(Aluno aluno) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("nome", aluno.getNome());
		json.put("logradouro", aluno.getEndereco().getLogradouro());
		json.put("cidade", aluno.getEndereco().getCidade());
		json.put("estado", aluno.getEndereco().getEstado());
		json.put("bairro", aluno.getEndereco().getBairro());
		json.put("cep", aluno.getEndereco().getCep());
		json.put("numero", aluno.getEndereco().getNumero());
		json.put("complemento", aluno.getEndereco().getComplemento());
		json.put("cpf", aluno.getCPF());
		json.put("rg", aluno.getRG());
		json.put("cpfresponsavel", aluno.getCPFresponsavel());
		json.put("nomeresponsavel", aluno.getNomeResponsavel());
		json.put("datanasc", aluno.getDataNascimento());
		json.put("datapag", aluno.getDataPagamento());
		json.put("telefone", aluno.getTelefone());
		json.put("celular", aluno.getCelular());
		json.put("celular1", aluno.getCelular1());
		json.put("email", aluno.getEmail());
		
		Envio envio = new Envio("aluno/adicionar",json);
		envio.run();
		System.out.println(envio.getResults());
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
		Envio envio = new Envio("aluno/update",json);
		envio.run();
	}
	
	public void delete(String matricula) throws JSONException, IOException {
		JSONObject json =  new JSONObject();
		json.put("cpf", matricula);
		Envio envio = new Envio("aluno/delete/"+matricula,json);
		envio.run();
		System.out.println(envio.getResults());
	}	
	
	public List<Aluno> select() throws JSONException, IOException, ParseException {
		JSONObject json =  new JSONObject();
		json.put("a", "a");
		Envio envio = new Envio("aluno/select",json);
		envio.run();
		json = new JSONObject(envio.getResults());
		JSONArray jsonArr= json.getJSONArray("aluno");
		List<Aluno> list = new ArrayList<>();
		for(int i=0;i<jsonArr.length();i++){
			json = jsonArr.getJSONObject(i);
			Endereco endereco = new Endereco(json.getString("logradouro"),json.getString("cidade"),json.getString("bairro"),json.getString("estado"),json.getString("numero"),json.getString("cep"),json.getString("complemento"));
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			Aluno aluno = new Aluno(json.getString("nome"), endereco, json.getString("nomeresponsavel"), json.getString("cpf"), json.getString("cpfresponsavel"), json.getString("rg"), json.getString("email"), new Date(df.parse(json.getString("datanasc")).getTime()), json.getString("telefone"), new Date(df.parse(json.getString("datapag")).getTime()), json.getString("matricula"), json.getString("celular"), json.getString("celular1"));
			list.add(aluno);
		}		
		return list;
	}
}
