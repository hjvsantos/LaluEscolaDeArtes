package data;

import java.io.IOException;
import java.util.List;

import org.json.JSONException;

import classesBasicas.Matricula;

public interface IRepositorioMatricula {
	public void insert(Matricula matricula) throws JSONException, IOException;
	public void update(Matricula matricula) throws JSONException, IOException;
	public void delete(String codigo) throws JSONException, IOException;
}
