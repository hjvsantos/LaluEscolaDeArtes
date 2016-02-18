package data;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import org.json.JSONException;

import classesBasicas.Aluno;

public interface IRepositorioAluno {
	public void insert(Aluno aluno) throws JSONException, IOException;
	public void update(Aluno aluno) throws JSONException, IOException;
	public void delete(String matricula) throws JSONException, IOException;
	public List<Aluno> select() throws JSONException, IOException, ParseException;
}

