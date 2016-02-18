package negocios;

import java.io.IOException;

import org.json.JSONException;

import classesBasicas.Matricula;
import data.IRepositorioMatricula;
import data.RepositorioMatricula;

public class CadastroMatricula {
	private IRepositorioMatricula ra = new RepositorioMatricula();
	
	public void insert(Matricula matricula) throws JSONException, IOException{
		ra.insert(matricula);
	}
	
	public void delete(int turma,String aluno) throws JSONException, IOException{
		ra.delete(turma,aluno);
	}
}
