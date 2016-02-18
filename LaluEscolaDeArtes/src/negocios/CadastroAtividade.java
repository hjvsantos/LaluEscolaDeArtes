package negocios;

import java.io.IOException;
import java.util.List;

import org.json.JSONException;

import classesBasicas.Atividade;
import data.IRepositorioAtividade;
import data.RepositorioAtividade;

public class CadastroAtividade {
	private IRepositorioAtividade ra = new RepositorioAtividade();
	
	public void insert(Atividade atividade) throws JSONException, IOException{
		ra.insert(atividade);
	}
	
	public void update(Atividade atividade) throws JSONException, IOException{
		ra.update(atividade);
	}
	
	public void delete(int codigo) throws JSONException, IOException{
		ra.delete(codigo);
	}
	
	public List<Atividade> select() throws JSONException, IOException{
		return ra.select();
	}
}
