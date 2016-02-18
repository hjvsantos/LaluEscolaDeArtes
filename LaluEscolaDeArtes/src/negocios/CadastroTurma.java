package negocios;

import java.io.IOException;
import java.util.List;

import org.json.JSONException;

import classesBasicas.Turma;
import data.IRepositorioTurma;
import data.RepositorioTurma;

public class CadastroTurma {
	private IRepositorioTurma rt = new RepositorioTurma();
	
	public void insert(Turma turma) throws JSONException, IOException{
		rt.insert(turma);
	}
	
	public void update(Turma turma) throws JSONException, IOException{
		rt.update(turma);
	}
	
	public void delete(int codigo) throws JSONException, IOException{
		rt.delete(codigo);
	}
	
	public List<Turma> select() throws JSONException, IOException{
		return rt.select();
	}
}
