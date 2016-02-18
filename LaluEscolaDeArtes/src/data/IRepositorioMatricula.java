package data;

import java.io.IOException;

import org.json.JSONException;

import classesBasicas.Matricula;

public interface IRepositorioMatricula {
	public void insert(Matricula matricula) throws JSONException, IOException;
	public void delete(int turma,String aluno) throws JSONException, IOException;
}