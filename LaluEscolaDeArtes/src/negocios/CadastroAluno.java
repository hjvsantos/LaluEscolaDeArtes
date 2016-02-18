package negocios;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import org.json.JSONException;

import classesBasicas.Aluno;
import data.IRepositorioAluno;
import data.RepositorioAluno;

public class CadastroAluno {
	private IRepositorioAluno ra = new RepositorioAluno();
	
	public void insert(Aluno aluno) throws JSONException, IOException{
		ra.insert(aluno);
	}
	
	public void update(Aluno aluno) throws JSONException, IOException{
		ra.update(aluno);
	}
	
	public void delete(String matricula) throws JSONException, IOException{
		ra.delete(matricula);
	}
	
	public List<Aluno> select() throws JSONException, IOException, ParseException{
		return ra.select();
	}
}
