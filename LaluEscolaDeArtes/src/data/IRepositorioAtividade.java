package data;

import java.io.IOException;
import java.util.List;

import org.json.JSONException;

import classesBasicas.Atividade;

public interface IRepositorioAtividade {
	
	public void insert(Atividade atividade) throws JSONException, IOException;
	public void update(Atividade atividade) throws JSONException, IOException;
	public List<Atividade> select() throws JSONException, IOException;
	public void delete(String nome) throws JSONException, IOException;
}
