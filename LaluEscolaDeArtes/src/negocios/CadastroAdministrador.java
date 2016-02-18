package negocios;

import java.io.IOException;
import java.util.List;

import org.json.JSONException;

import classesBasicas.Administrador;
import data.IRepositorioAdministrador;
import data.RepositorioAdministrador;

public class CadastroAdministrador {
	private IRepositorioAdministrador ra = new RepositorioAdministrador();
	
	public void insert(Administrador administrador) throws JSONException, IOException{
		ra.insert(administrador);
	}
	
	public void update(Administrador administrador) throws JSONException, IOException{
		ra.update(administrador);
	}
	
	public void delete(String id) throws JSONException, IOException{
		ra.delete(id);
	}
	
	public List<Administrador> select() throws JSONException, IOException{
		return ra.select();
	}
}