package data;

import java.io.IOException;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import classesBasicas.Aluno;

public interface IRepositorioAluno {
	public void insert(Aluno aluno) throws JSONException, IOException;
	public void update(Aluno aluno) throws JSONException, IOException;
	public void delete(String id) throws JSONException, IOException;
	public List<Aluno> select() throws JSONException, IOException;
}
