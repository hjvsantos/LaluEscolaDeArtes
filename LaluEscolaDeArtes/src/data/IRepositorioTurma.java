package data;

import java.io.IOException;
import java.util.List;

import org.json.JSONException;

import classesBasicas.Turma;

public interface IRepositorioTurma {
	
	public void insert(Turma turma) throws JSONException, IOException;
	public void update(Turma turma) throws JSONException, IOException;
	public List<Turma> select() throws JSONException, IOException;
	public void delete(String codigo) throws JSONException, IOException;
}
