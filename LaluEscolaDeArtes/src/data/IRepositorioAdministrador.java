package data;

import java.io.IOException;
import java.util.List;

import org.json.JSONException;

import classesBasicas.Administrador;

public interface IRepositorioAdministrador {
	public void insert(Administrador administrador) throws JSONException, IOException;
	public void update(Administrador administrador) throws JSONException, IOException;
	public List<Administrador> select() throws JSONException, IOException;
	public void delete(String id) throws JSONException, IOException;
}
